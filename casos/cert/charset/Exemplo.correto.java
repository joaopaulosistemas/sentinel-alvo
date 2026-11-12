// correto: sentinel-cert-charset-implicito
class Exemplo {
  byte[] a(String s) {
    return s.getBytes(java.nio.charset.StandardCharsets.UTF_8);
  }
}
