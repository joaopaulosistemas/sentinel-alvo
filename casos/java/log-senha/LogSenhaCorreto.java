// correto: sentinel-log-dado-sensivel
package alvo.logsenha;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class LogSenhaCorreto {
    private static final Logger log = LoggerFactory.getLogger(LogSenhaCorreto.class);
    void entrar(String usuario, String senha) {
        log.info("login de {}", usuario);
    }
}
