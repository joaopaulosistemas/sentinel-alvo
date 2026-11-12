// correto: sentinel-obs-excecao-relancada-sem-causa
class Servico {
  void rodar(Runnable r) {
    try {
      r.run();
    } catch (RuntimeException e) {
      throw new IllegalStateException("falha ao rodar", e);
    }
  }
}
