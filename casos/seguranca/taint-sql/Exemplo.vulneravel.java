import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.jdbc.core.JdbcTemplate;
class Exemplo {
  void a(@RequestParam String id, JdbcTemplate jdbc) {
    // alvo: sentinel-taint-sql-parametro-http
    jdbc.query("SELECT * FROM t WHERE id = " + id, (rs, i) -> 1);
  }
}
