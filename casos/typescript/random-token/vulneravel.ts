export function novoToken() {
  // alvo: sentinel-node-math-random-segredo
  const token = Math.random().toString(36).slice(2);
  return token;
}
