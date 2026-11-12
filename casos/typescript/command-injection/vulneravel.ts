import express from 'express';
const app = express();
import { exec } from 'child_process';

app.get('/listar', (req, res) => {
  // alvo: sentinel-node-command-injection
  exec('ls ' + req.query.pasta, (e, saida) => res.send(saida));
});
