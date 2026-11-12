// correto: sentinel-mem-threadlocal-sem-remove
class Contexto {
  private static final ThreadLocal<String> USUARIO = new ThreadLocal<>();
  static void usar(String u, Runnable r) {
    USUARIO.set(u);
    try { r.run(); } finally { USUARIO.remove(); }
  }
}
