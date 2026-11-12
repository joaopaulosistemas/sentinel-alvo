// correto: sentinel-mem-addeventlistener-sem-remove
export class C {
  private onResize = () => this.ajustar();
  ngOnInit() {
    window.addEventListener('resize', this.onResize);
  }
  ngOnDestroy() {
    window.removeEventListener('resize', this.onResize);
  }
  ajustar() {}
}
