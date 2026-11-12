// correto: sentinel-cct-condicao-composta
export function f(a: boolean, b: boolean, c: boolean) {
  const podeEmitir = a && b && c;
  if (podeEmitir) { return 1; }
  return 0;
}
