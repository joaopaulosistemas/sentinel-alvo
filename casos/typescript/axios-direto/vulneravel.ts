import axios from 'axios';

export async function buscar() {
  // alvo: sentinel-int-axios-sem-timeout
  const r = await axios.get('https://api.parceiro.com.br/itens');
  return r.data;
}
