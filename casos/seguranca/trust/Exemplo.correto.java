// correto: sentinel-servlet-trust-boundary
import jakarta.servlet.http.*;
class Exemplo {
  void a(HttpServletRequest req) {
    req.getSession().setAttribute("perfil", "padrao");
  }
}
