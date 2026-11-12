// correto: sentinel-node-desserializacao
export function f(req: any) {
  return JSON.parse(req.body.dados);
}
