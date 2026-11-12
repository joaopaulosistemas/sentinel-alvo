import jakarta.servlet.http.*;
class Exemplo {
  void a(HttpServletRequest req, HttpServletResponse res) throws Exception {
    // alvo: sentinel-forward-nao-validado
    req.getRequestDispatcher(req.getParameter("p")).forward(req, res);
  }
}
