interface Cliente { id: number; nome: string }
export function ler(texto: string): Cliente {
  // alvo: sentinel-boas-ts-json-sem-validacao
  return JSON.parse(texto) as Cliente;
}
