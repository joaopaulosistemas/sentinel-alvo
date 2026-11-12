class Leitor {
  void ler(Runnable r) {
    try {
      r.run();
    // alvo: sentinel-java-catch-vazio
    } catch (RuntimeException e) {
    }
  }
}
