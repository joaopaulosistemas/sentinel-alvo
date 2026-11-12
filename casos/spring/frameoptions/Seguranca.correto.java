// correto: sentinel-spring-frameoptions-desligado
class Seguranca {
  void configurar(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws Exception {
    http.headers().frameOptions().sameOrigin();
  }
}
