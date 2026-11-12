export function f(req: any, s: string) {
  // alvo: sentinel-node-regexp-da-requisicao
  return new RegExp(req.query.padrao).test(s);
}
