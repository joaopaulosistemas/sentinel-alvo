package alvo.leituratotal;

import java.nio.file.Files;
import java.nio.file.Path;

class LeituraTotalVulneravel {
    byte[] ler(Path arquivo) throws Exception {
        // alvo: sentinel-mem-leitura-total-de-arquivo
        return Files.readAllBytes(arquivo);
    }
}
