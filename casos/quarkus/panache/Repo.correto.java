// correto: sentinel-quarkus-panache-consulta-concatenada
import io.quarkus.hibernate.orm.panache.PanacheRepository;
class Repo implements PanacheRepository<Object> {
  Object achar(String nome) {
    return find("nome = ?1", nome).firstResult();
  }
}
