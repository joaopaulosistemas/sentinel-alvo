export function f(req: any) {
  // alvo: sentinel-node-eval-requisicao
  return eval(req.body.expr);
}
