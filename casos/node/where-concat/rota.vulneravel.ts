export function f(col: any, nome: string) {
  // alvo: sentinel-node-nosql-where-concatenado
  return col.find({ $where: "this.nome == '" + nome + "'" });
}
