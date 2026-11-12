class Exemplo {
  void a() {
    // alvo: sentinel-cert-interrupted-engolida
    try {
      Thread.sleep(10);
    } catch (InterruptedException e) {
    }
  }
}
