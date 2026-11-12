// correto: sentinel-node-jwt-sem-algoritmo
import jwt from 'jsonwebtoken';

export function ler(token: string, chave: string) {
  return jwt.verify(token, chave, { algorithms: ['HS256'] });
}
