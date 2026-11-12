import org.springframework.web.bind.annotation.*;
@RestController
class Controle {
  @PostMapping("/pedidos")
  String criar(
      // alvo: sentinel-spring-requestbody-sem-valid
      @RequestBody Pedido p) { return "ok"; }
  record Pedido(String nome) {}
}
