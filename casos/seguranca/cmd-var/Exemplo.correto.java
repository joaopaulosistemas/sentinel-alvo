// correto: sentinel-command-injection-variable
class Exemplo {
  void a() throws Exception {
    Runtime.getRuntime().exec(new String[] { "ls", "-l" });
  }
}
