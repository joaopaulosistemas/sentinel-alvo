import org.springframework.web.bind.annotation.*;
class ClienteEntity { Long id; }
// alvo: sentinel-camadas-controller-expoe-entidade
@RestController
class Controle {
  @GetMapping("/c") public ClienteEntity buscar() { return new ClienteEntity(); }
}
