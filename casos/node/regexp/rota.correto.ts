// correto: sentinel-node-regexp-da-requisicao
export function f(req: any, s: string) {
  return s.includes(String(req.query.padrao));
}
