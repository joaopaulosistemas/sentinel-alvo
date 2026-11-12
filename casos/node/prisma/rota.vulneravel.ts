export async function f(prisma: any, nome: string) {
  // alvo: sentinel-node-prisma-raw-unsafe
  return prisma.$queryRawUnsafe(`SELECT * FROM c WHERE nome = '${nome}'`);
}
