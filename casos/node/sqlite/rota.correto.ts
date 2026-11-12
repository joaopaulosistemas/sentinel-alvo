// correto: sentinel-node-sqlite-sql-dinamico
import Database from 'better-sqlite3';
export function f(nome: string) {
  const db = new Database('x.db');
  return db.prepare('SELECT * FROM c WHERE nome = ?').all(nome);
}
