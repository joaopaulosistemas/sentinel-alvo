package alvo.retornanullcolecao;

import java.util.List;

class RetornaNullColecaoVulneravel {
    // alvo: sentinel-java-retorna-null-colecao
    List<String> nomes(boolean tem) {
        if (!tem) {
            return null;
        }
        return List.of("a");
    }
}
