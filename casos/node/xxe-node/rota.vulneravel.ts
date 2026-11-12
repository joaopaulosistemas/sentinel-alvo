import libxml from 'libxmljs';
export function f(xml: string) {
  // alvo: sentinel-node-xxe
  return libxml.parseXml(xml, { noent: true });
}
