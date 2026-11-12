// correto: sentinel-spring-requestbody-sem-valid
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
@RestController
class Controle {
  @PostMapping("/pedidos")
  String criar(@Valid @RequestBody Pedido p) { return "ok"; }
  record Pedido(String nome) {}
}
