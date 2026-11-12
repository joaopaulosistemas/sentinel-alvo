// correto: sentinel-node-xpath-injection
import xpath from 'xpath';
export function f(doc: any) {
  return xpath.select('//u[@n="fixo"]', doc);
}
