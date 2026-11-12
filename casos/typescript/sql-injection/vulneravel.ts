import express from 'express';
const app = express();
import { Pool } from 'pg';
const db = new Pool();

app.get('/cliente', async (req, res) => {
  // alvo: sentinel-node-sql-injection
  const r = await db.query("SELECT * FROM clientes WHERE id = " + req.query.id);
  res.json(r.rows);
});
