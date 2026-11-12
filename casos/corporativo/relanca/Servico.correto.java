// correto: sentinel-ee-catch-relanca-sem-causa
class NegocioException extends RuntimeException { NegocioException(String m) { super(m); } NegocioException(String m, Throwable c) { super(m, c); } }
class Servico {
  void rodar(Runnable r) {
    try {
      r.run();
    } catch (IllegalStateException e) {
      throw new NegocioException("falha ao rodar", e);
    }
  }
}
