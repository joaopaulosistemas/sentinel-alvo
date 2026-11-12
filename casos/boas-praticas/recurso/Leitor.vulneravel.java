import java.io.*;
class Leitor {
  int ler(File f) throws IOException {
    // alvo: sentinel-boas-java-recurso-sem-try-with-resources
    FileInputStream in = new FileInputStream(f);
    int b = in.read();
    in.close();
    return b;
  }
}
