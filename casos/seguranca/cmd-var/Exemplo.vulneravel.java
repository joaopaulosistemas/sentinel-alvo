class Exemplo {
  void a(String cmd) throws Exception {
    // alvo: sentinel-command-injection-variable
    Runtime.getRuntime().exec(cmd);
  }
}
