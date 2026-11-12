// correto: sentinel-boas-java-recurso-sem-try-with-resources
import java.io.*;
class Leitor {
  int ler(File f) throws IOException {
    try (FileInputStream in = new FileInputStream(f)) {
      return in.read();
    }
  }
}
