// correto: sentinel-command-injection-requisicao
import jakarta.servlet.http.*;
class Exemplo {
  void a(HttpServletRequest req) throws Exception {
    Runtime.getRuntime().exec(new String[] { "ls", "-l" });
  }
}
