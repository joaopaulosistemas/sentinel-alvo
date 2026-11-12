class Exemplo {
  void a(jakarta.servlet.http.Cookie c) {
    // alvo: sentinel-cookie-secure-desligado
    c.setSecure(false);
  }
}
