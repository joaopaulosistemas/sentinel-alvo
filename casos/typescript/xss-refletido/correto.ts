// correto: sentinel-node-xss-refletido
import express from 'express';
const app = express();

import escapeHtml from 'escape-html';
app.get('/busca', (req, res) => {
  res.send('<p>Resultados para ' + escapeHtml(String(req.query.q)) + '</p>');
});
