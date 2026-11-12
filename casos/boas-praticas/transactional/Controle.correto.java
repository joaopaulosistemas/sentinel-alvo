// correto: sentinel-boas-spring-transactional-no-controller
import org.springframework.web.bind.annotation.*;
import org.springframework.transaction.annotation.Transactional;
@RestController
class Controle {
  @PostMapping("/c") void gravar() {}
}
@org.springframework.stereotype.Service
class Servico {
  @Transactional void gravar() {}
}
