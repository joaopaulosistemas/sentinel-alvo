// correto: sentinel-api-jwt-chave-fixa-js
import jwt from 'jsonwebtoken';
export const t = jwt.sign({ id: 1 }, process.env.JWT_SECRET as string);
