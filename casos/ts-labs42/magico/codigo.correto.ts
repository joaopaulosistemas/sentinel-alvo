// correto: sentinel-cct-numero-magico
const SEGUNDOS_POR_DIA = 86400;
export function f(n: number) {
  if (n > SEGUNDOS_POR_DIA) { return 1; }
  return 0;
}
