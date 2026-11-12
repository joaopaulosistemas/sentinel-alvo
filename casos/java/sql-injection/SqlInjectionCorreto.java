// correto: sentinel-sql-injection
package alvo.sqlinjection;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;

class SqlInjectionCorreto {
    java.sql.ResultSet buscar(HttpServletRequest req, Connection c) throws Exception {
        java.sql.PreparedStatement ps = c.prepareStatement("SELECT * FROM clientes WHERE nome = ?");
        ps.setString(1, req.getParameter("nome"));
        return ps.executeQuery();
    }
}
