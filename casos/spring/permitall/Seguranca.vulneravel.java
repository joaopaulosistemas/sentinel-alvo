class Seguranca {
  void configurar(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws Exception {
    // alvo: sentinel-spring-permitall-geral
    http.authorizeHttpRequests(a -> a.anyRequest().permitAll());
  }
}
