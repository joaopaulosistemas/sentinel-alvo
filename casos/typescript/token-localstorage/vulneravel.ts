export function guardar(token: string) {
  // alvo: sentinel-ts-token-em-localstorage
  localStorage.setItem('token', token);
}
