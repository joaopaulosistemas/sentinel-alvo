import org.springframework.stereotype.Service;
@Service
class Exemplo {
  String a() {
    // alvo: sentinel-crypto-random-servidor
    return Long.toHexString(new java.util.Random().nextLong());
  }
}
