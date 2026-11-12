import org.springframework.web.bind.annotation.*;
import org.springframework.transaction.annotation.Transactional;
@RestController
class Controle {
  // alvo: sentinel-boas-spring-transactional-no-controller
  @Transactional
  @PostMapping("/c") void gravar() {}
}
