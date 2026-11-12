// correto: sentinel-jpa-findall-sem-paginacao
import java.util.List;
class Servico {
  Repo repo;
  Object pagina() {
    return repo.findAll(org.springframework.data.domain.PageRequest.of(0, 50));
  }
  interface Repo extends org.springframework.data.jpa.repository.JpaRepository<Object, Long> {}
}
