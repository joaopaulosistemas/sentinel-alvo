#!/usr/bin/env python3
"""Gera regras.json a partir dos pacotes do Sentinel: id, pacote, linguagens, severidade e CWE de cada regra."""
import glob, json, os, sys
import yaml

def main(sentinel):
    saida = []
    for pacote in sorted(glob.glob(os.path.join(sentinel, "audit-rules", "packs", "*"))):
        for arq in sorted(glob.glob(os.path.join(pacote, "rules", "**", "*.yml"), recursive=True)):
            doc = yaml.safe_load(open(arq, encoding="utf-8")) or {}
            for r in doc.get("rules", []):
                meta = r.get("metadata") or {}
                saida.append({
                    "id": r["id"], "pacote": os.path.basename(pacote),
                    "arquivo": os.path.relpath(arq, sentinel),
                    "linguagens": r.get("languages", []), "severidade": r.get("severity"),
                    "cwe": str(meta.get("cwe", "")).split(":")[0], "taint": r.get("mode") == "taint",
                })
    ids = [r["id"] for r in saida]
    dup = {i for i in ids if ids.count(i) > 1}
    if dup:
        sys.exit(f"ids repetidos: {sorted(dup)}")
    json.dump(saida, open("regras.json", "w", encoding="utf-8"), indent=1, ensure_ascii=False)
    print(f"{len(saida)} regras em regras.json")

if __name__ == "__main__":
    main(sys.argv[1] if len(sys.argv) > 1 else "../sentinel")
