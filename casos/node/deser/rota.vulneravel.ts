import serialize from 'node-serialize';
export function f(req: any) {
  // alvo: sentinel-node-desserializacao
  return serialize.unserialize(req.body.dados);
}
