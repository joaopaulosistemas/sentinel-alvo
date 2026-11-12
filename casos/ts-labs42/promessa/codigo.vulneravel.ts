export function f(p: Promise<void>) {
  // alvo: sentinel-cct-promessa-rejeicao-ignorada
  p.catch(() => {});
}
