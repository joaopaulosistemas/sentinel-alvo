class Exemplo {
  final Object lock = new Object();
  boolean pronto;
  void a() throws InterruptedException {
    synchronized (lock) {
      // alvo: sentinel-cert-wait-fora-de-loop
      lock.wait();
    }
  }
}
