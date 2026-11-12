package alvo.retornanullcolecao;

import java.util.List;

class RetornaNullColecaoDiretoVulneravel {
    // alvo: sentinel-java-retorna-null-colecao
    List<String> nomes() {
        return null;
    }
}
