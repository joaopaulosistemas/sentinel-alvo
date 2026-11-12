import java.io.File;
import java.nio.file.*;
class Exemplo {
  void a(File f) {
    // alvo: sentinel-cert-retorno-ignorado-arquivo
    f.delete();
  }
}
