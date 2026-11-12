export function montar(corpo: string) {
  // alvo: sentinel-node-function-dinamico
  return new Function('x', corpo);
}
