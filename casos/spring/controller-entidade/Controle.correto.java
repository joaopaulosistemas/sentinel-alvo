// correto: sentinel-camadas-controller-expoe-entidade
import org.springframework.web.bind.annotation.*;
record ClienteDto(Long id) {}
@RestController
class Controle {
  @GetMapping("/c") public ClienteDto buscar() { return new ClienteDto(1L); }
}
