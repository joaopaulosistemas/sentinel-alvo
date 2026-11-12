import crypto from 'crypto';

export function resumo(s: string) {
  // alvo: sentinel-node-hash-fraco
  return crypto.createHash('md5').update(s).digest('hex');
}
