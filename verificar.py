#!/usr/bin/env python3
"""Confere que as regras do Sentinel pegam exemplos escritos por fora delas.

Uso: verificar.py [--sentinel ../sentinel] [--exigir-cobertura N]

Cada arquivo em casos/ marca o que espera:
  // alvo: <id-da-regra>      a linha seguinte tem que gerar achado dessa regra (vulnerável)
  // correto: <id-da-regra>   no arquivo todo, essa regra NÃO pode achar nada (falso positivo)
Duas listas registram o que já se sabe, para o verde não esconder nem inventar problema:
  lacunas.txt             regras que não pegam o exemplo vulnerável (falso negativo conhecido)
  falsos-positivos.txt    regras que acham algo no exemplo correto (falso positivo conhecido)
Sai com 1 quando: uma regra marcada como alvo não dispara e não está em lacunas.txt; uma regra de uma das listas
deixou de errar (tire-a da lista); há falso positivo fora de falsos-positivos.txt; ou a cobertura (regras com caso / total) caiu abaixo do exigido.
"""
import argparse, glob, json, os, re, shutil, subprocess, sys, tempfile

AMBIENTE = dict(os.environ, LC_ALL="C.UTF-8", PYTHONUTF8="1", SEMGREP_SEND_METRICS="off")
JANELA = 3  # o achado pode começar até 3 linhas depois da marca (anotação, modificadores, comentário de várias linhas)


def anotacoes(raiz):
    alvos, corretos = [], []
    for arq in sorted(glob.glob(os.path.join(raiz, "casos", "**", "*"), recursive=True)):
        if not os.path.isfile(arq):
            continue
        rel = os.path.relpath(arq, raiz)
        for n, linha in enumerate(open(arq, encoding="utf-8"), 1):
            m = re.search(r"\b(alvo|correto):\s*(sentinel-[\w-]+)", linha)
            if m:
                (alvos if m.group(1) == "alvo" else corretos).append((m.group(2), rel, n))
    return alvos, corretos


def rodar(motor, sentinel, raiz):
    cmd = [motor, "scan", "--json", "--quiet", "--timeout", "30"]
    if os.path.basename(motor) == "semgrep":
        cmd.append("--metrics=off")
    for d in sorted(glob.glob(os.path.join(sentinel, "audit-rules", "packs", "*", "rules"))):
        cmd += ["--config", d]
    with tempfile.TemporaryDirectory() as tmp:
        saida = os.path.join(tmp, "r.json")
        p = subprocess.run(cmd + ["-o", saida, os.path.join(raiz, "casos")], capture_output=True, text=True, env=AMBIENTE)
        if not os.path.exists(saida) or os.path.getsize(saida) == 0:
            sys.exit(f"o motor não gerou relatório (código {p.returncode}): {p.stderr[-500:]}")
        dados = json.load(open(saida, encoding="utf-8"))
    erros = [e.get("message", "")[:200] for e in dados.get("errors", []) if e.get("level") == "error"]
    achados = {(r["check_id"].split(".")[-1], os.path.relpath(r["path"], raiz), r["start"]["line"]) for r in dados["results"]}
    return achados, erros


def lista(arquivo):
    if not os.path.exists(arquivo):
        return set()
    return {l.split("#")[0].strip() for l in open(arquivo, encoding="utf-8") if l.split("#")[0].strip()}


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--sentinel", default="../sentinel")
    ap.add_argument("--exigir-cobertura", type=int, default=0)
    a = ap.parse_args()
    raiz = os.path.dirname(os.path.abspath(__file__))
    motor = shutil.which("opengrep") or shutil.which("semgrep")
    if not motor:
        sys.exit("nem opengrep nem semgrep no PATH")
    regras = {r["id"] for r in json.load(open(os.path.join(raiz, "regras.json"), encoding="utf-8"))}
    alvos, corretos = anotacoes(raiz)
    achados, erros = rodar(motor, a.sentinel, raiz)
    lacunas = lista(os.path.join(raiz, "lacunas.txt"))
    fp_conhecidos = lista(os.path.join(raiz, "falsos-positivos.txt"))

    desconhecidas = sorted({i for i, _, _ in alvos + corretos} - regras)
    nao_pegou, ok = [], set()
    for rid, arq, n in alvos:
        if any(i == rid and f == arq and n < l <= n + JANELA for i, f, l in achados):
            ok.add(rid)
        else:
            nao_pegou.append((rid, arq, n))
    falsos = sorted((i, f, l) for i, f, l in achados for rid, arq, _ in corretos if i == rid and f == arq)
    fp_novos = [(i, f, l) for i, f, l in falsos if i not in fp_conhecidos]
    fp_curados = sorted(fp_conhecidos - {i for i, _, _ in falsos})
    novas_lacunas = sorted({r for r, _, _ in nao_pegou} - lacunas)
    curadas = sorted(lacunas & ok)
    com_caso = {r for r, _, _ in alvos} & regras
    cobertura = len(com_caso)

    print(f"Motor: {os.path.basename(motor)} | regras no Sentinel: {len(regras)} | com caso: {cobertura} | pegas: {len(ok)}")
    for r in sorted(lacunas - ok):
        print(f"  lacuna conhecida (não pega o exemplo): {r}")
    for r in sorted(fp_conhecidos & {i for i, _, _ in falsos}):
        print(f"  falso positivo conhecido (acha o exemplo correto): {r}")
    status = 0
    for msg, itens in (
        ("regra inexistente no inventário (rode inventario.py)", desconhecidas),
        ("NÃO PEGOU o exemplo vulnerável", [f"{r} em {f}:{n}" for r, f, n in nao_pegou if r in novas_lacunas]),
        ("FALSO POSITIVO no exemplo correto", [f"{i} em {f}:{l}" for i, f, l in fp_novos]),
        ("passou a pegar: tire de lacunas.txt", curadas),
        ("deixou de dar falso positivo: tire de falsos-positivos.txt", fp_curados),
        ("erro ao carregar regra no motor", erros),
    ):
        for it in itens:
            print(f"ERRO: {msg}: {it}")
            status = 1
    if cobertura < a.exigir_cobertura:
        print(f"ERRO: cobertura {cobertura} abaixo do mínimo {a.exigir_cobertura}")
        status = 1
    sem_caso = sorted(regras - com_caso)
    open(os.path.join(raiz, "pendentes.txt"), "w", encoding="utf-8").write("\n".join(sem_caso) + "\n")
    print(f"Sem caso ainda: {len(sem_caso)} (lista em pendentes.txt)")
    sys.exit(status)


if __name__ == "__main__":
    main()
