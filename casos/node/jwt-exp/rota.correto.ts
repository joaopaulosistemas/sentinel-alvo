// correto: sentinel-node-jwt-expiracao-ignorada
import jwt from 'jsonwebtoken';
export function f(t: string) {
  return jwt.verify(t, 'k');
}
