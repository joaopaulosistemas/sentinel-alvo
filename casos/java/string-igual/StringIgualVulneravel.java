package alvo.stringigual;


class StringIgualVulneravel {
    boolean admin(String perfil) {
        // alvo: sentinel-java-string-igualdade-literal
        return perfil == "ADMIN";
    }
}
