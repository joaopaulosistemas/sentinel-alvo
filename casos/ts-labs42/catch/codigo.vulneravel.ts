export function f(g: () => void) {
  // alvo: sentinel-cct-catch-so-registra
  try { g(); } catch (e) { console.log(e); }
}
