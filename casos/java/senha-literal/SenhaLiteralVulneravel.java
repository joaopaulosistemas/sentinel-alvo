package alvo.senhaliteral;


class SenhaLiteralVulneravel {
    boolean entrar(String usuario, String senha) {
        // alvo: sentinel-senha-comparada-com-literal
        return usuario.equals("admin") && senha.equals("admin123");
    }
}
