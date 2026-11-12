class Exemplo {
  void a(Object o) {
    // alvo: sentinel-cert-catch-npe
    try {
      o.toString();
    } catch (NullPointerException e) {
      o = "";
    }
  }
}
