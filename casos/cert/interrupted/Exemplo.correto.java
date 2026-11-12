// correto: sentinel-cert-interrupted-engolida
class Exemplo {
  void a() {
    try {
      Thread.sleep(10);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }
}
