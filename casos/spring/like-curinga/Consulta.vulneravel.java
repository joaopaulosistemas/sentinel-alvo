class Consulta {
  String sql() {
    // alvo: sentinel-sql-like-curinga-inicial
    return "select id from clientes where nome like '%silva'";
  }
}
