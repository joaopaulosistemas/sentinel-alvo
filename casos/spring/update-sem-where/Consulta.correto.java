// correto: sentinel-sql-update-sem-where
class Consulta {
  String sql() {
    return "update clientes set ativo = false where id = ?";
  }
}
