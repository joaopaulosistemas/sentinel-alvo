import org.springframework.web.bind.annotation.RequestParam;
class Exemplo {
  void a(@RequestParam String u) throws Exception {
    // alvo: sentinel-api-ssrf
    new java.net.URL(u).openStream();
  }
}
