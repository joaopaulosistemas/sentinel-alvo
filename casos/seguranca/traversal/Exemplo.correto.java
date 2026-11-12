// correto: sentinel-api-path-traversal
import org.springframework.web.bind.annotation.RequestParam;
class Exemplo {
  void a(@RequestParam String f) throws Exception {
    new java.io.FileInputStream(new java.io.File("/dados/" + java.nio.file.Paths.get(f).getFileName()));
  }
}
