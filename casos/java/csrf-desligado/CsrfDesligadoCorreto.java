// correto: sentinel-api-csrf-disabled
package alvo.csrfdesligado;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

class CsrfDesligadoCorreto {
    void configurar(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().authenticated();
    }
}
