// correto: sentinel-session-fixation-desligada
package alvo.sessionfixation;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

class SessionFixationCorreto {
    void configurar(HttpSecurity http) throws Exception {
        http.sessionManagement().sessionFixation().migrateSession();
    }
}
