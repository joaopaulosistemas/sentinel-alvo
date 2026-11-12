import org.springframework.web.bind.annotation.RequestParam;
class Exemplo {
  void a(@RequestParam String f) throws Exception {
    // alvo: sentinel-api-path-traversal
    new java.io.FileInputStream(new java.io.File("/dados/" + f));
  }
}
