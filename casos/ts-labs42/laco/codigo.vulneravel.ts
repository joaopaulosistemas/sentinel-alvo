export function f(l: number[]) {
  let s = 0;
  // alvo: sentinel-cct-laco-com-indice
  for (let i = 0; i < l.length; i++) { s += l[i]; }
  return s;
}
