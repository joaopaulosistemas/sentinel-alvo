export function f(p: Promise<number>) {
  // alvo: sentinel-cct-then-encadeado
  return p.then((v) => v + 1).catch(() => 0);
}
