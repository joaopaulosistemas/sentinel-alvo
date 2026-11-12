export function f(pool: any, nome: string) {
  // alvo: sentinel-node-sql-concatenado
  return pool.query("SELECT * FROM c WHERE nome = '" + nome + "'");
}
