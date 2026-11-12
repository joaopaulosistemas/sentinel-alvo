// correto: sentinel-node-sql-injection
import express from 'express';
const app = express();
import { Pool } from 'pg';
const db = new Pool();

app.get('/cliente', async (req, res) => {
  const r = await db.query('SELECT * FROM clientes WHERE id = $1', [req.query.id]);
  res.json(r.rows);
});
