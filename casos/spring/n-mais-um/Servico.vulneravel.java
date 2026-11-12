import java.util.List;
class Servico {
  ClienteRepository clienteRepository;
  void ler(List<Long> ids) {
    // alvo: sentinel-jpa-n-mais-um
    for (Long id : ids) {
      Object c = clienteRepository.findById(id).get();
    }
  }
  interface ClienteRepository { java.util.Optional<Object> findById(Long id); }
}
