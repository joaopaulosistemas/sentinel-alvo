// correto: sentinel-node-path-traversal
import express from 'express';
const app = express();
import fs from 'fs';

import path from 'path';
app.get('/arquivo', (req, res) => {
  const nome = path.basename(String(req.query.nome));
  fs.readFile(path.join('/dados', nome), (e, d) => res.send(d));
});
