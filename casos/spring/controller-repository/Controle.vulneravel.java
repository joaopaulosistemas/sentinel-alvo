import org.springframework.web.bind.annotation.*;
// alvo: sentinel-camadas-controller-usa-repository
@RestController
class Controle {
  private final ClienteRepository clienteRepository;
  Controle(ClienteRepository r) { this.clienteRepository = r; }
  @GetMapping("/c") Object listar() { return clienteRepository.findAll(); }
  interface ClienteRepository { Object findAll(); }
}
