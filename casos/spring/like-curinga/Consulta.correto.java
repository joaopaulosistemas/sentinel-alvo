// correto: sentinel-sql-like-curinga-inicial
class Consulta {
  String sql() {
    return "select id from clientes where nome like 'silva%'";
  }
}
