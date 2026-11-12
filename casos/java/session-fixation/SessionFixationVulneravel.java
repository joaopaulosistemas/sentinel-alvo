package alvo.sessionfixation;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

class SessionFixationVulneravel {
    void configurar(HttpSecurity http) throws Exception {
        // alvo: sentinel-session-fixation-desligada
        http.sessionManagement().sessionFixation().none();
    }
}
