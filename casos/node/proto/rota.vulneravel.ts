// alvo: sentinel-node-prototype-pollution
export function mesclar(alvo: any, fonte: any) {
  for (const k in fonte) {
    if (typeof fonte[k] === 'object') { mesclar(alvo[k], fonte[k]); } else { alvo[k] = fonte[k]; }
  }
  return alvo;
}
