class Servico {
  String url() {
    // alvo: sentinel-quarkus-getenv-direto
    return System.getenv("URL_PARCEIRO");
  }
}
