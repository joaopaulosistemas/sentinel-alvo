import jwt from 'jsonwebtoken';
export function f(t: string) {
  // alvo: sentinel-node-jwt-expiracao-ignorada
  return jwt.verify(t, 'k', { ignoreExpiration: true });
}
