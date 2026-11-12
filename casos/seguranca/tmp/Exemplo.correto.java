// correto: sentinel-arquivo-temporario-inseguro
import java.nio.file.*;
class Exemplo {
  Path a() throws java.io.IOException {
    return Files.createTempFile("dados", ".tmp");
  }
}
