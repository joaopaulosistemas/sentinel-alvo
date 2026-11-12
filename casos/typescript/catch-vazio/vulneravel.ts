export function tentar(f: () => void) {
  try {
    f();
  // alvo: sentinel-ts-catch-vazio
  } catch (e) {}
}
