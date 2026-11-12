// correto: sentinel-int-axios-sem-timeout
import axios from 'axios';

export const api = axios.create({ baseURL: 'https://api.parceiro.com.br', timeout: 5000 });
