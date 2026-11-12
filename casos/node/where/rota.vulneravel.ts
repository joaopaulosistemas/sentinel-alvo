export function f(req: any, col: any) {
  // alvo: sentinel-node-nosql-where
  return col.find({ $where: req.body.filtro });
}
