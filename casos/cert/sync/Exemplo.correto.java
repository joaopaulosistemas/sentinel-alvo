// correto: sentinel-cert-sync-em-string-ou-boxed
class Exemplo {
  private final Object trava = new Object();
  void a() {
    synchronized (trava) {
    }
  }
}
