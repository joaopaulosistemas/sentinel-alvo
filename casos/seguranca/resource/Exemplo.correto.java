// correto: sentinel-resource-path-concatenado
import org.springframework.web.bind.annotation.RequestParam;
class Exemplo {
  java.io.InputStream a(@RequestParam String n) {
    return getClass().getResourceAsStream("/templates/" + java.nio.file.Paths.get(n).getFileName());
  }
}
