import express from 'express';
const app = express();

app.get('/busca', (req, res) => {
  // alvo: sentinel-node-xss-refletido
  res.send('<p>Resultados para ' + req.query.q + '</p>');
});
