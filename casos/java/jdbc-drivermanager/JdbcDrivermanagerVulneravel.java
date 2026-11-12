package alvo.jdbcdrivermanager;

import java.sql.Connection;
import java.sql.DriverManager;

class JdbcDrivermanagerVulneravel {
    Connection abrir() throws Exception {
        // alvo: sentinel-int-jdbc-driver-manager
        return DriverManager.getConnection("jdbc:postgresql://banco:5432/app", "app", System.getenv("DB_PASS"));
    }
}
