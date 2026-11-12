export class C {
  iniciar() {
    // alvo: sentinel-mem-setinterval-sem-clear
    setInterval(() => this.atualizar(), 1000);
  }
  atualizar() {}
}
