package alvo.logconcatenado;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class LogConcatenadoVulneravel {
    private static final Logger log = LoggerFactory.getLogger(LogConcatenadoVulneravel.class);
    void ver(String usuario) {
        // alvo: sentinel-java-log-concatenado
        log.info("usuario " + usuario + " entrou");
    }
}
