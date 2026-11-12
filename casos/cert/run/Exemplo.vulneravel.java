class Exemplo {
  void a(Runnable r) {
    Thread t = new Thread(r);
    // alvo: sentinel-cert-thread-run-direto
    t.run();
  }
}
