import jakarta.enterprise.inject.spi.CDI;
class Servico {
  Object repo() {
    // alvo: sentinel-java-service-locator
    return CDI.current().select(Object.class).get();
  }
}
