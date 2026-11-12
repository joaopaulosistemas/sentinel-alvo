import jakarta.servlet.http.*;
class Exemplo {
  void a(HttpServletRequest req, java.util.logging.Logger log) {
    // alvo: sentinel-log-injection
    log.info("usuario " + req.getParameter("u"));
  }
}
