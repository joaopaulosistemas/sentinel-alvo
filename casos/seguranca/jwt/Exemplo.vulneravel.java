import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
class Exemplo {
  void a(String t) {
    // alvo: sentinel-api-jwt-sem-verificacao
    JWT.decode(t);
  }
}
