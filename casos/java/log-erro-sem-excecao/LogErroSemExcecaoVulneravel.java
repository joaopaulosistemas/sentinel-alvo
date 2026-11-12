package alvo.logerrosemexcecao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class LogErroSemExcecaoVulneravel {
    private static final Logger log = LoggerFactory.getLogger(LogErroSemExcecaoVulneravel.class);
    void gravar(Runnable r) {
        try {
            r.run();
        } catch (RuntimeException e) {
            // alvo: sentinel-obs-log-erro-sem-excecao
            log.error("falha ao gravar");
        }
    }
}
