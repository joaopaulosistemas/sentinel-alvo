package alvo.sqlinjection;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;

class SqlInjectionVulneravel {
    java.sql.ResultSet buscar(HttpServletRequest req, Connection c) throws Exception {
        String nome = req.getParameter("nome");
        // alvo: sentinel-sql-injection
        return c.createStatement().executeQuery("SELECT * FROM clientes WHERE nome = '" + nome + "'");
    }
}
