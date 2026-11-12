// correto: sentinel-cct-then-encadeado
export async function f(p: Promise<number>) {
  try {
    const v = await p;
    return v + 1;
  } catch {
    return 0;
  }
}
