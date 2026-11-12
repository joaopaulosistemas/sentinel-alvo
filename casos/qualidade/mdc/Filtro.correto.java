// correto: sentinel-obs-mdc-sem-limpeza
import org.slf4j.MDC;
class Filtro {
  void entrar(String usuario, Runnable r) {
    MDC.put("usuario", usuario);
    try { r.run(); } finally { MDC.clear(); }
  }
}
