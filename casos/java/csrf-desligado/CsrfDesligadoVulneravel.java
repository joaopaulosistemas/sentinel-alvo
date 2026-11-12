package alvo.csrfdesligado;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

class CsrfDesligadoVulneravel {
    void configurar(HttpSecurity http) throws Exception {
        // alvo: sentinel-api-csrf-disabled
        http.csrf().disable();
    }
}
