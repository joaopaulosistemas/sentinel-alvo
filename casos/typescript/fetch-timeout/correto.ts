// correto: sentinel-int-fetch-sem-timeout
export async function buscar() {
  const r = await fetch('https://api.parceiro.com.br/itens', { signal: AbortSignal.timeout(5000) });
  return r.json();
}
