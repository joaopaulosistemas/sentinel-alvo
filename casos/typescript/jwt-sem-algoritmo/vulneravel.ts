import jwt from 'jsonwebtoken';

export function ler(token: string, chave: string) {
  // alvo: sentinel-node-jwt-sem-algoritmo
  return jwt.verify(token, chave);
}
