import express from 'express';
const app = express();

app.get('/sair', (req, res) => {
  // alvo: sentinel-node-open-redirect
  res.redirect(req.query.next as string);
});
