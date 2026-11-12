import jwt from 'jsonwebtoken';
export function f(t: string) {
  // alvo: sentinel-node-jwt-algoritmo-none
  return jwt.verify(t, 'k', { algorithms: ['HS256', 'none'] });
}
