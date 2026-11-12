// correto: sentinel-node-ldap-injection
export function f(cli: any) {
  return cli.search('dc=ex', { filter: '(uid=fixo)' });
}
