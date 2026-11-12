import axios from 'axios';

// alvo: sentinel-int-axios-sem-timeout
export const api = axios.create({ baseURL: 'https://api.parceiro.com.br' });
