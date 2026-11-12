// correto: sentinel-mem-setinterval-sem-clear
export class C {
  private timer?: ReturnType<typeof setInterval>;
  iniciar() {
    this.timer = setInterval(() => this.atualizar(), 1000);
  }
  ngOnDestroy() {
    clearInterval(this.timer);
  }
  atualizar() {}
}
