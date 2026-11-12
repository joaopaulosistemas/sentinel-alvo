class Consulta {
  String sql() {
    // alvo: sentinel-sql-order-by-aleatorio
    return "select id from clientes order by random()";
  }
}
