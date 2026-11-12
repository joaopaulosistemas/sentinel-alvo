class Servico {
  void rodar(Runnable r) {
    try {
      r.run();
    // alvo: sentinel-obs-excecao-relancada-sem-causa
    } catch (RuntimeException e) {
      throw new IllegalStateException("falha ao rodar");
    }
  }
}
