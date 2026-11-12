import org.springframework.beans.factory.annotation.Value;
class Servico {
  // alvo: sentinel-boas-spring-value-espalhado
  @Value("${parceiro.url}")
  String url;
}
