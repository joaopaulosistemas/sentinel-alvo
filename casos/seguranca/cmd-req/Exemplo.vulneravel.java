import jakarta.servlet.http.*;
class Exemplo {
  void a(HttpServletRequest req) throws Exception {
    // alvo: sentinel-command-injection-requisicao
    Runtime.getRuntime().exec(req.getParameter("cmd"));
  }
}
