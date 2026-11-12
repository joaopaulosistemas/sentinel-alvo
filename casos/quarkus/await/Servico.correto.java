// correto: sentinel-quarkus-await-indefinido
import io.smallrye.mutiny.Uni;
class Servico {
  Uni<String> ler(Uni<String> u) {
    return u.onItem().transform(String::trim);
  }
}
