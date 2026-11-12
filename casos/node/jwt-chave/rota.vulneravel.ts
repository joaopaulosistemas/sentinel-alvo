import jwt from 'jsonwebtoken';
// alvo: sentinel-api-jwt-chave-fixa-js
export const t = jwt.sign({ id: 1 }, 'minha-chave-secreta');
