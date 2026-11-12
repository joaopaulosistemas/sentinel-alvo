// correto: sentinel-api-jwt-chave-fixa
package alvo.jwtchavefixa;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

class JwtChaveFixaCorreto {
    String emitir(String usuario, java.security.Key chave) {
        return Jwts.builder().setSubject(usuario).signWith(chave).compact();
    }
}
