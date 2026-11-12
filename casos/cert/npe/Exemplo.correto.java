// correto: sentinel-cert-catch-npe
class Exemplo {
  void a(Object o) {
    if (o != null) { o.toString(); }
  }
}
