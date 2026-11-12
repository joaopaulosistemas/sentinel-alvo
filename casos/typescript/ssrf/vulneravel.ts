import express from 'express';
const app = express();
import axios from 'axios';

app.get('/proxy', async (req, res) => {
  // alvo: sentinel-node-ssrf
  const r = await axios.get(req.query.url as string);
  res.send(r.data);
});
