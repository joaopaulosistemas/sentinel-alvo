import org.springframework.web.bind.annotation.RequestParam;
class Exemplo {
  java.io.InputStream a(@RequestParam String n) {
    // alvo: sentinel-resource-path-concatenado
    return getClass().getResourceAsStream("/templates/" + n);
  }
}
