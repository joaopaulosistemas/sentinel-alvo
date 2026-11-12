// alvo: sentinel-cct-parametro-callback
export function carregar(id: number, callback: (r: string) => void) { callback(String(id)); }
