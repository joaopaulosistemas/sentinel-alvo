export async function buscar() {
  // alvo: sentinel-int-fetch-sem-timeout
  const r = await fetch('https://api.parceiro.com.br/itens');
  return r.json();
}
