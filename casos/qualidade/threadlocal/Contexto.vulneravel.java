class Contexto {
  // alvo: sentinel-mem-threadlocal-sem-remove
  private static final ThreadLocal<String> USUARIO = new ThreadLocal<>();
  static void definir(String u) { USUARIO.set(u); }
}
