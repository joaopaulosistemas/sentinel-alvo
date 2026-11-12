// correto: sentinel-ts-catch-vazio
export function tentar(f: () => void) {
  try {
    f();
  } catch (e) {
    console.error(e);
  }
}
