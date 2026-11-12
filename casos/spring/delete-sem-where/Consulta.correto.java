// correto: sentinel-sql-delete-sem-where
class Consulta {
  String sql() {
    return "delete from clientes where id = ?";
  }
}
