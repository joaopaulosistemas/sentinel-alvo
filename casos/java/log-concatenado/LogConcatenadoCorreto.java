// correto: sentinel-java-log-concatenado
package alvo.logconcatenado;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class LogConcatenadoCorreto {
    private static final Logger log = LoggerFactory.getLogger(LogConcatenadoCorreto.class);
    void ver(String usuario) {
        log.info("usuario {} entrou", usuario);
    }
}
