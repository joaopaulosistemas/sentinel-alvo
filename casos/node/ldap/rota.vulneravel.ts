export function f(req: any, cli: any) {
  // alvo: sentinel-node-ldap-injection
  return cli.search('dc=ex', { filter: `(uid=${req.body.uid})` });
}
