export function f(req: any, User: any) {
  // alvo: sentinel-node-mass-assignment
  return User.create(req.body);
}
