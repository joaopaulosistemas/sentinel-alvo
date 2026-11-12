class NegocioException extends RuntimeException { NegocioException(String m) { super(m); } NegocioException(String m, Throwable c) { super(m, c); } }
class Servico {
  void rodar(Runnable r) {
    try {
      r.run();
    // alvo: sentinel-ee-catch-relanca-sem-causa
    } catch (IllegalStateException e) {
      throw new NegocioException(e.getMessage());
    }
  }
}
