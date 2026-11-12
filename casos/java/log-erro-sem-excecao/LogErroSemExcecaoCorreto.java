// correto: sentinel-obs-log-erro-sem-excecao
package alvo.logerrosemexcecao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class LogErroSemExcecaoCorreto {
    private static final Logger log = LoggerFactory.getLogger(LogErroSemExcecaoCorreto.class);
    void gravar(Runnable r) {
        try {
            r.run();
        } catch (RuntimeException e) {
            log.error("falha ao gravar", e);
        }
    }
}
