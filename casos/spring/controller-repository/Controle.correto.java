// correto: sentinel-camadas-controller-usa-repository
import org.springframework.web.bind.annotation.*;
@RestController
class Controle {
  private final ClienteService servico;
  Controle(ClienteService s) { this.servico = s; }
  @GetMapping("/c") Object listar() { return servico.listar(); }
  interface ClienteService { Object listar(); }
}
