// correto: sentinel-quarkus-getenv-direto
import org.eclipse.microprofile.config.inject.ConfigProperty;
class Servico {
  @ConfigProperty(name = "parceiro.url")
  String url;
}
