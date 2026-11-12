// correto: sentinel-node-xxe
import libxml from 'libxmljs';
export function f(xml: string) {
  return libxml.parseXml(xml);
}
