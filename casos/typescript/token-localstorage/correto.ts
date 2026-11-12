// correto: sentinel-ts-token-em-localstorage
export function guardar(token: string) {
  document.cookie = 'sessao=' + token + '; Secure; HttpOnly; SameSite=Strict';
}
