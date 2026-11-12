import io.quarkus.hibernate.orm.panache.PanacheRepository;
class Repo implements PanacheRepository<Object> {
  Object achar(String nome) {
    // alvo: sentinel-quarkus-panache-consulta-concatenada
    return find("nome = '" + nome + "'").firstResult();
  }
}
