import java.util.List;
class Servico {
  Repo repo;
  void gravar(List<Object> itens) {
    // alvo: sentinel-jpa-escrita-em-loop
    for (Object i : itens) {
      repo.save(i);
    }
  }
  interface Repo extends org.springframework.data.jpa.repository.JpaRepository<Object, Long> {}
}
