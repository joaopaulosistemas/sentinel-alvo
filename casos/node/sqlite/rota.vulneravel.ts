import Database from 'better-sqlite3';
export function f(nome: string) {
  const db = new Database('x.db');
  // alvo: sentinel-node-sqlite-sql-dinamico
  return db.prepare(`SELECT * FROM c WHERE nome = '${nome}'`).all();
}
