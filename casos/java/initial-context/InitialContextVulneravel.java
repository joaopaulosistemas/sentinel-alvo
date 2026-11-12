package alvo.initialcontext;

import javax.naming.InitialContext;

class InitialContextVulneravel {
    Object achar() throws Exception {
        // alvo: sentinel-ee-initialcontext-direto
        return new InitialContext().lookup("java:comp/env/jdbc/app");
    }
}
