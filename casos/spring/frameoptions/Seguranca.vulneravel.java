class Seguranca {
  void configurar(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws Exception {
    // alvo: sentinel-spring-frameoptions-desligado
    http.headers().frameOptions().disable();
  }
}
