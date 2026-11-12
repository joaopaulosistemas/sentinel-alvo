// correto: sentinel-crossorigin-aberto
import org.springframework.web.bind.annotation.CrossOrigin;
class Exemplo {
  @CrossOrigin(origins = {"https://app.exemplo.com"})
  void a() {}
}
