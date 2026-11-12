// correto: sentinel-android-segredo-literal-comparado
class Tela {
  boolean a(String digitado, String hashEsperado) {
    return java.security.MessageDigest.isEqual(digitado.getBytes(), hashEsperado.getBytes());
  }
}
