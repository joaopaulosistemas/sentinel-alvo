// correto: sentinel-api-jwt-sem-verificacao
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
class Exemplo {
  void a(String t, Algorithm alg) {
    JWT.require(alg).build().verify(t);
  }
}
