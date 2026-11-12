// correto: sentinel-api-ssrf
import org.springframework.web.bind.annotation.RequestParam;
class Exemplo {
  void a(@RequestParam String u) throws Exception {
    new java.net.URL("https://api.exemplo.com/dados").openStream();
  }
}
