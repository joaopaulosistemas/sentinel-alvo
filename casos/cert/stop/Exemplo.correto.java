// correto: sentinel-cert-thread-stop
class Exemplo {
  void a(Thread t) {
    t.interrupt();
  }
}
