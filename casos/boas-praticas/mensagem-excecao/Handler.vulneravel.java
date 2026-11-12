import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestControllerAdvice
class Handler {
  @ExceptionHandler(Exception.class)
  ResponseEntity<String> tratar(Exception e) {
    // alvo: sentinel-boas-spring-mensagem-de-excecao-ao-cliente
    return ResponseEntity.status(500).body(e.getMessage());
  }
}
