// correto: sentinel-jpa-escrita-em-loop
import java.util.List;
class Servico {
  Repo repo;
  void gravar(List<Object> itens) {
    repo.saveAll(itens);
  }
  interface Repo extends org.springframework.data.jpa.repository.JpaRepository<Object, Long> {}
}
