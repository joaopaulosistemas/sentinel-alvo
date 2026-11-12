import java.util.List;
class Servico {
  ClienteRepository clienteRepository;
  void ler(List<Long> ids) {
    // alvo: sentinel-perf-consulta-em-laco
    for (Long id : ids) {
      clienteRepository.findById(id);
    }
  }
  interface ClienteRepository { Object findById(Long id); }
}
