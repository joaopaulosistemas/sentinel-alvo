// correto: sentinel-log-injection
import jakarta.servlet.http.*;
class Exemplo {
  void a(HttpServletRequest req, java.util.logging.Logger log) {
    log.info("usuario " + req.getParameter("u").replaceAll("[\r\n]", "_"));
  }
}
