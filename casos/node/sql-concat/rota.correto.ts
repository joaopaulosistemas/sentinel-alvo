// correto: sentinel-node-sql-concatenado
export function f(pool: any, nome: string) {
  return pool.query('SELECT * FROM c WHERE nome = $1', [nome]);
}
