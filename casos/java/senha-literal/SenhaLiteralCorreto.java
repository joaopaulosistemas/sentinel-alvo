// correto: sentinel-senha-comparada-com-literal
package alvo.senhaliteral;


class SenhaLiteralCorreto {
    boolean entrar(String usuario, String senhaDigitada, String hashSalvo) {
        return org.springframework.security.crypto.bcrypt.BCrypt.checkpw(senhaDigitada, hashSalvo);
    }
}
