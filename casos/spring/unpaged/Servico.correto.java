// correto: sentinel-jpa-pageable-unpaged
import org.springframework.data.domain.PageRequest;
class Servico {
  Object pagina(Repo repo) {
    return repo.findAll(PageRequest.of(0, 50));
  }
  interface Repo extends org.springframework.data.jpa.repository.JpaRepository<Object, Long> {}
}
