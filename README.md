# sentinel-alvo

Alvo de teste do [Sentinel Audit Tool](https://github.com/joaopaulosistemas/sentinel): para cada regra, um exemplo
**vulnerável** e um **correto**, escritos a partir do problema (CWE, documentação OWASP) e não da sintaxe da regra.
Um verificador roda o motor (Opengrep/Semgrep) com os pacotes do Sentinel e confere se cada regra pega o que deve
e fica quieta onde não deve.

> Os arquivos de `casos/` são **intencionalmente vulneráveis**. Não os use como modelo e não os coloque em produção.

## Como funciona

```java
// alvo: sentinel-crypto-hash-fraco      <- a linha seguinte tem que gerar achado dessa regra
MessageDigest md = MessageDigest.getInstance("MD5");
```

```java
// correto: sentinel-crypto-hash-fraco   <- no arquivo todo, essa regra não pode achar nada
```

`python3 verificar.py --sentinel ../sentinel` falha quando:

| Situação | Significa |
|---|---|
| uma regra marcada `alvo` não dispara | falso negativo novo |
| uma regra dispara num arquivo `correto` e não está em `falsos-positivos.txt` | falso positivo novo |
| uma regra de `lacunas.txt` ou `falsos-positivos.txt` deixou de errar | corrigida: tire da lista |
| a cobertura cai abaixo de `--exigir-cobertura` | caso removido |

## Estado

- 311 regras no Sentinel (`regras.json`, gerado por `inventario.py`); **73 com caso** (Java, TypeScript, Dockerfile, Compose e
  Kubernetes), as outras 238 em `pendentes.txt`.
- 68 pegam o exemplo vulnerável. **5 lacunas** (`lacunas.txt`):
  - `zip-slip`: não vê `ZipEntry e;` declarado antes do laço;
  - `open-redirect-spring`: depende do nome da variável (`destino` passa);
  - `api-jwt-chave-fixa`: não cobre `signWith(alg, "literal")`;
  - `ssrf-url-do-parametro`: exige a URL como parâmetro do método;
  - `docker-imagem-latest`: só analisa o arquivo chamado exatamente `Dockerfile` (`Dockerfile.prod` passa).
- **2 falsos positivos** (`falsos-positivos.txt`): `open-redirect` e `servlet-path-traversal` marcam o código com a
  defesa recomendada (validar o destino; `getCanonicalFile()` + `startsWith`).

## Limites (leia antes de confiar no verde)

- Prova que a regra dispara no exemplo, não que pega **todas** as variações. Para isso há o OWASP Benchmark e a
  calibração com repositórios reais, no repositório do Sentinel.
- Roda o motor sobre os pacotes de regras, não a API do Sentinel inteira (clone, perfis, confiança, relatório).
- Regras que dependem de arquivos que não são Java (SQL, XML, IaC, Vue) precisam de casos na linguagem delas.

## Uso

```bash
pip install -r requirements.txt
python3 inventario.py ../sentinel        # atualiza regras.json
python3 verificar.py --sentinel ../sentinel --exigir-cobertura 73
```

No GitHub Actions o Sentinel é privado: crie o secret `SENTINEL_TOKEN` (leitura de conteúdo em
`joaopaulosistemas/sentinel`). O fluxo também roda toda segunda-feira e por `repository_dispatch`
(`regras-do-sentinel-mudaram`).

## Como acrescentar uma regra

1. Escolha uma em `pendentes.txt`.
2. Em `casos/<linguagem>/<tema>/` crie `*Vulneravel` e `*Correto` a partir do problema real, sem abrir o YAML da regra.
3. Marque `// alvo:` e `// correto:`, rode o verificador e suba `--exigir-cobertura`.
4. Se a regra não pegar um exemplo legítimo, **não ajuste o exemplo**: registre em `lacunas.txt` e corrija a regra.
