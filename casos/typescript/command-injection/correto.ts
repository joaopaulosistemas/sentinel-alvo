// correto: sentinel-node-command-injection
import express from 'express';
const app = express();
import { exec } from 'child_process';

import { execFile } from 'child_process';
app.get('/listar', (req, res) => {
  execFile('ls', ['--', String(req.query.pasta)], (e, saida) => res.send(saida));
});
