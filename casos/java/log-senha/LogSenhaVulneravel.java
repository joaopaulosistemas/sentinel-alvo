package alvo.logsenha;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class LogSenhaVulneravel {
    private static final Logger log = LoggerFactory.getLogger(LogSenhaVulneravel.class);
    void entrar(String usuario, String senha) {
        // alvo: sentinel-log-dado-sensivel
        log.info("login de " + usuario + " com senha " + senha);
    }
}
