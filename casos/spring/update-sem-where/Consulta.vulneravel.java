class Consulta {
  String sql() {
    // alvo: sentinel-sql-update-sem-where
    return "update clientes set ativo = false";
  }
}
