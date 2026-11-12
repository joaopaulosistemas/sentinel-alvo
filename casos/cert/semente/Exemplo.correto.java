// correto: sentinel-cert-securerandom-semente-fixa
import java.security.SecureRandom;
class Exemplo {
  SecureRandom a() {
    return new SecureRandom();
  }
}
