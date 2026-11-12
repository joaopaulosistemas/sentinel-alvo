import xpath from 'xpath';
export function f(doc: any, nome: string) {
  // alvo: sentinel-node-xpath-injection
  return xpath.select("//u[@n='" + nome + "']", doc);
}
