// correto: sentinel-perf-consulta-em-laco
import java.util.List;
class Servico {
  ClienteRepository clienteRepository;
  void ler(List<Long> ids) {
    clienteRepository.findAllById(ids);
  }
  interface ClienteRepository { Object findAllById(List<Long> ids); }
}
