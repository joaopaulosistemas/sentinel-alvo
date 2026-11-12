import jakarta.inject.Inject;
class Servico {
  // alvo: sentinel-quarkus-inject-campo-privado
  @Inject
  private Object repo;
}
