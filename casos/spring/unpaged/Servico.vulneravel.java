import org.springframework.data.domain.Pageable;
class Servico {
  Object tudo(Repo repo) {
    // alvo: sentinel-jpa-pageable-unpaged
    return repo.findAll(Pageable.unpaged());
  }
  interface Repo extends org.springframework.data.jpa.repository.JpaRepository<Object, Long> {}
}
