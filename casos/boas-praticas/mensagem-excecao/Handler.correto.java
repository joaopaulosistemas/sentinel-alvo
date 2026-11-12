// correto: sentinel-boas-spring-mensagem-de-excecao-ao-cliente
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestControllerAdvice
class Handler {
  @ExceptionHandler(Exception.class)
  ResponseEntity<String> tratar(Exception e) {
    return ResponseEntity.status(500).body("Erro interno");
  }
}
