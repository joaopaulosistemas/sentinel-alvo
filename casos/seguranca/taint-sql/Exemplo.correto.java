// correto: sentinel-taint-sql-parametro-http
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.jdbc.core.JdbcTemplate;
class Exemplo {
  void a(@RequestParam String id, JdbcTemplate jdbc) {
    jdbc.query("SELECT * FROM t WHERE id = ?", (rs, i) -> 1, id);
  }
}
