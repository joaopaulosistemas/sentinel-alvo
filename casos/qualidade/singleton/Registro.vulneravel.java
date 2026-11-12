class Registro {
  private static Registro instancia;
  private Registro() {}
  // alvo: sentinel-java-singleton-manual
  public static Registro getInstance() {
    if (instancia == null) { instancia = new Registro(); }
    return instancia;
  }
}
