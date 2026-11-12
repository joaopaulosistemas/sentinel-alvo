// correto: sentinel-cert-thread-run-direto
class Exemplo {
  void a(Runnable r) {
    Thread t = new Thread(r);
    t.start();
  }
}
