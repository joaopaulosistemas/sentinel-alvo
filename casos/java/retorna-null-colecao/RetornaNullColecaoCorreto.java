// correto: sentinel-java-retorna-null-colecao
package alvo.retornanullcolecao;

import java.util.List;

class RetornaNullColecaoCorreto {
    List<String> nomes(boolean tem) {
        if (!tem) {
            return List.of();
        }
        return List.of("a");
    }
}
