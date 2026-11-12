// correto: sentinel-node-math-random-segredo
import { randomBytes } from 'crypto';
export function novoToken() {
  const token = randomBytes(24).toString('hex');
  return token;
}
