export function ler(f: () => void) {
  try {
    f();
  } catch (e) {
    // alvo: sentinel-obs-catch-console-sem-erro
    console.error('falha ao ler');
  }
}
