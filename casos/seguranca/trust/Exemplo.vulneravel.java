import jakarta.servlet.http.*;
class Exemplo {
  void a(HttpServletRequest req) {
    // alvo: sentinel-servlet-trust-boundary
    req.getSession().setAttribute("perfil", req.getParameter("perfil"));
  }
}
