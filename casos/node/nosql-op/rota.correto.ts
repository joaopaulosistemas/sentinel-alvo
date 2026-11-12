// correto: sentinel-node-nosql-operador
export function f(req: any, User: any) {
  return User.findOne({ nome: String(req.body.nome) });
}
