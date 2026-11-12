import org.slf4j.MDC;
class Filtro {
  void entrar(String usuario) {
    // alvo: sentinel-obs-mdc-sem-limpeza
    MDC.put("usuario", usuario);
  }
}
