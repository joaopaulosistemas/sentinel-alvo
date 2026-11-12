// correto: sentinel-node-hash-fraco
import crypto from 'crypto';

export function resumo(s: string) {
  return crypto.createHash('sha256').update(s).digest('hex');
}
