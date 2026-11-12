import io.smallrye.mutiny.Uni;
class Servico {
  Uni<String> ler() throws Exception {
    // alvo: sentinel-quarkus-sleep-em-reativo
    Thread.sleep(500);
    return Uni.createFrom().item("ok");
  }
}
