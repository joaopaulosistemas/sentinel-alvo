// correto: sentinel-forward-nao-validado
import jakarta.servlet.http.*;
class Exemplo {
  void a(HttpServletRequest req, HttpServletResponse res) throws Exception {
    req.getRequestDispatcher("/pagina.jsp").forward(req, res);
  }
}
