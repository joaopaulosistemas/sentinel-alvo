// correto: sentinel-cert-wait-fora-de-loop
class Exemplo {
  final Object lock = new Object();
  boolean pronto;
  void a() throws InterruptedException {
    synchronized (lock) {
      while (!pronto) { lock.wait(); }
    }
  }
}
