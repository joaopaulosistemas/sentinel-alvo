// correto: sentinel-node-mass-assignment
export function f(req: any, User: any) {
  const { nome, email } = req.body;
  return User.create({ nome, email });
}
