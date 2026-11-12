export class C {
  ngOnInit() {
    // alvo: sentinel-mem-addeventlistener-sem-remove
    window.addEventListener('resize', () => this.ajustar());
  }
  ajustar() {}
}
