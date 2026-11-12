// correto: sentinel-cct-catch-so-registra
export function f(g: () => void) {
  try { g(); } catch (e) { throw new Error('falha ao executar', { cause: e }); }
}
