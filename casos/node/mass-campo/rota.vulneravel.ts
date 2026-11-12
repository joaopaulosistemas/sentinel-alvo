export function f(req: any, u: any) {
  // alvo: sentinel-node-mass-assignment-campo
  u.role = req.body.role;
}
