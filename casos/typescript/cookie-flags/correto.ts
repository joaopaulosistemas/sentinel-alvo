// correto: sentinel-node-cookie-sem-flags
import express from 'express';
const app = express();

app.get('/entrar', (req, res) => {
  res.cookie('sid', 'abc123', { httpOnly: true, secure: true, sameSite: 'strict' });
  res.send('ok');
});
