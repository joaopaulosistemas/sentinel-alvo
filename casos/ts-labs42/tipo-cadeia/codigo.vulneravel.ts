export function f(x: unknown) {
  // alvo: sentinel-cct-verificacao-de-tipo-em-cadeia
  if (typeof x === 'string') { return 1; } else if (typeof x === 'number') { return 2; } else if (x instanceof Date) { return 3; }
  return 0;
}
