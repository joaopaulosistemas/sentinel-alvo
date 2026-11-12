import express from 'express';
const app = express();

app.get('/entrar', (req, res) => {
  // alvo: sentinel-node-cookie-sem-flags
  res.cookie('sid', 'abc123');
  res.send('ok');
});
