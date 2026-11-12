export function f(req: any, User: any) {
  // alvo: sentinel-node-nosql-operador
  return User.findOne({ nome: req.body.nome });
}
