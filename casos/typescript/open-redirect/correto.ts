// correto: sentinel-node-open-redirect
import express from 'express';
const app = express();

app.get('/sair', (req, res) => {
  res.redirect('/inicio');
});
