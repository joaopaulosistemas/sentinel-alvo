// correto: sentinel-quarkus-sleep-em-reativo
import io.smallrye.mutiny.Uni;
class Servico {
  Uni<String> ler() {
    return Uni.createFrom().item("ok").onItem().delayIt().by(java.time.Duration.ofMillis(500));
  }
}
