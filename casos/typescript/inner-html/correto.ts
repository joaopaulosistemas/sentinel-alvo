// correto: sentinel-xss-inner-html
export function mostrar(el: HTMLElement, texto: string) {
  el.textContent = texto;
}
