// correto: sentinel-sql-select-estrela
class Consulta {
  String sql() {
    return "select id, nome from clientes where ativo = true";
  }
}
