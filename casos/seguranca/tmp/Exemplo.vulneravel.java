import java.io.File;
class Exemplo {
  File a() throws java.io.IOException {
    // alvo: sentinel-arquivo-temporario-inseguro
    return File.createTempFile("dados", ".tmp");
  }
}
