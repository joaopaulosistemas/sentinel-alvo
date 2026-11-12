import java.security.SecureRandom;
class Exemplo {
  SecureRandom a() {
    SecureRandom r = new SecureRandom();
    // alvo: sentinel-cert-securerandom-semente-fixa
    r.setSeed(12345L);
    return r;
  }
}
