// correto: sentinel-jpa-n-mais-um
import java.util.List;
class Servico {
  ClienteRepository clienteRepository;
  void ler(List<Long> ids) {
    List<Object> todos = clienteRepository.findAllById(ids);
  }
  interface ClienteRepository { List<Object> findAllById(List<Long> ids); }
}
