export function mostrar(el: HTMLElement, texto: string) {
  // alvo: sentinel-xss-inner-html
  el.innerHTML = texto;
}
