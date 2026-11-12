// correto: sentinel-node-jwt-algoritmo-none
import jwt from 'jsonwebtoken';
export function f(t: string) {
  return jwt.verify(t, 'k', { algorithms: ['HS256'] });
}
