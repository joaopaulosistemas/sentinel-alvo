import cors from 'cors';
import express from 'express';
const app = express();

// alvo: sentinel-api-cors-aberto-js
app.use(cors({ origin: '*' }));
