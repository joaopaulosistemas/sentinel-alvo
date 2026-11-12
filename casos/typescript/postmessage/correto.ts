// correto: sentinel-postmessage-origem-curinga
export function avisar(janela: Window, msg: string) {
  janela.postMessage(msg, 'https://app.exemplo.com.br');
}
