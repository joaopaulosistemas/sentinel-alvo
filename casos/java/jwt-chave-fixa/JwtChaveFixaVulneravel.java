package alvo.jwtchavefixa;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

class JwtChaveFixaVulneravel {
    String emitir(String usuario) {
        // alvo: sentinel-api-jwt-chave-fixa
        return Jwts.builder().setSubject(usuario).signWith(SignatureAlgorithm.HS256, "segredo-do-jwt-123").compact();
    }
}
