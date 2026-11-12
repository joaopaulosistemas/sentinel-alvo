// correto: sentinel-java-catch-vazio
class Leitor {
  void ler(Runnable r) {
    try {
      r.run();
    } catch (RuntimeException e) {
      throw new IllegalStateException("falha ao ler", e);
    }
  }
}
