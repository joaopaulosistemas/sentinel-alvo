// correto: sentinel-quarkus-inject-campo-privado
import jakarta.inject.Inject;
class Servico {
  @Inject
  Object repo;
}
