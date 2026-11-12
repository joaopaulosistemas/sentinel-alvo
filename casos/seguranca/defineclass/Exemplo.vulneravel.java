class Exemplo {
  void a(ClassLoader cl) throws Exception {
    // alvo: sentinel-classloader-define-classe
    java.lang.reflect.Method m = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, int.class, int.class);
  }
}
