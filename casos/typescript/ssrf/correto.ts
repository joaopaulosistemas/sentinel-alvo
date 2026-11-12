// correto: sentinel-node-ssrf
import express from 'express';
const app = express();
import axios from 'axios';

app.get('/proxy', async (req, res) => {
  const r = await axios.get('https://api.parceiro.com.br/cotacao');
  res.send(r.data);
});
