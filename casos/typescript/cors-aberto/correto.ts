// correto: sentinel-api-cors-aberto-js
import cors from 'cors';
import express from 'express';
const app = express();

app.use(cors({ origin: 'https://app.exemplo.com.br' }));
