// correto: sentinel-spring-permitall-geral
class Seguranca {
  void configurar(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws Exception {
    http.authorizeHttpRequests(a -> a.anyRequest().authenticated());
  }
}
