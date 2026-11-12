// correto: sentinel-cert-retorno-ignorado-arquivo
import java.io.File;
import java.nio.file.*;
class Exemplo {
  void a(Path p) throws java.io.IOException {
    Files.delete(p);
  }
}
