// correto: sentinel-cct-promessa-rejeicao-ignorada
export async function f(p: Promise<void>) {
  await p;
}
