export function avisar(janela: Window, msg: string) {
  // alvo: sentinel-postmessage-origem-curinga
  janela.postMessage(msg, '*');
}
