// correto: sentinel-node-nosql-where
export function f(req: any, col: any) {
  return col.find({ nome: String(req.body.nome) });
}
