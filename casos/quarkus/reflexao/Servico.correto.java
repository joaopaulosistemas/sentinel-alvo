// correto: sentinel-quarkus-reflexao-nativa
class Servico {
  Object criar(java.util.function.Supplier<Object> fabrica) {
    return fabrica.get();
  }
}
