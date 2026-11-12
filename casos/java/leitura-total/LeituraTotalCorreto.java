// correto: sentinel-mem-leitura-total-de-arquivo
package alvo.leituratotal;

import java.nio.file.Files;
import java.nio.file.Path;

class LeituraTotalCorreto {
    long contar(Path arquivo) throws Exception {
        try (java.util.stream.Stream<String> linhas = Files.lines(arquivo)) {
            return linhas.count();
        }
    }
}
