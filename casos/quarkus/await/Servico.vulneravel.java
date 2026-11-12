import io.smallrye.mutiny.Uni;
class Servico {
  String ler(Uni<String> u) {
    // alvo: sentinel-quarkus-await-indefinido
    return u.await().indefinitely();
  }
}
