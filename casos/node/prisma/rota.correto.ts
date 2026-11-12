// correto: sentinel-node-prisma-raw-unsafe
export async function f(prisma: any, nome: string) {
  return prisma.$queryRaw`SELECT * FROM c WHERE nome = ${nome}`;
}
