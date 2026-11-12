class Servico {
  Object criar(String nome) throws Exception {
    // alvo: sentinel-quarkus-reflexao-nativa
    return Class.forName(nome).getDeclaredConstructor().newInstance();
  }
}
