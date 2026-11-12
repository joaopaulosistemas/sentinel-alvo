import java.util.List;
class Servico {
  Repo repo;
  List<Object> todos() {
    // alvo: sentinel-jpa-findall-sem-paginacao
    return repo.findAll();
  }
  interface Repo extends org.springframework.data.jpa.repository.JpaRepository<Object, Long> {}
}
