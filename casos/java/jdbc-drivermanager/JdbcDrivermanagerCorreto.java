// correto: sentinel-int-jdbc-driver-manager
package alvo.jdbcdrivermanager;

import java.sql.Connection;
import java.sql.DriverManager;

class JdbcDrivermanagerCorreto {
    Connection abrir(javax.sql.DataSource ds) throws Exception {
        return ds.getConnection();
    }
}
