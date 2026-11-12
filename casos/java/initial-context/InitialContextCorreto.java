// correto: sentinel-ee-initialcontext-direto
package alvo.initialcontext;

import javax.naming.InitialContext;

class InitialContextCorreto {
    @jakarta.annotation.Resource(lookup = "java:comp/env/jdbc/app")
    javax.sql.DataSource ds;

}
