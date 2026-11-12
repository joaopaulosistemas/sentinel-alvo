// correto: sentinel-classloader-define-classe
class Exemplo {
  void a(ClassLoader cl) throws Exception {
    cl.loadClass("demo.Plugin");
  }
}
