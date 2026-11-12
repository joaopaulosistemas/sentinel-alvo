import express from 'express';
const app = express();
import fs from 'fs';

app.get('/arquivo', (req, res) => {
  // alvo: sentinel-node-path-traversal
  fs.readFile('/dados/' + req.query.nome, (e, d) => res.send(d));
});
