// correto: sentinel-crypto-random-servidor
import org.springframework.stereotype.Service;
@Service
class Exemplo {
  String a() {
    return Long.toHexString(new java.security.SecureRandom().nextLong());
  }
}
