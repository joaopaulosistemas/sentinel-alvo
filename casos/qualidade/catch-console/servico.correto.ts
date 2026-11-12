// correto: sentinel-obs-catch-console-sem-erro
export function ler(f: () => void) {
  try {
    f();
  } catch (e) {
    console.error('falha ao ler', e);
  }
}
