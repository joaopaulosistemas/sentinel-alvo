// correto: sentinel-desserializacao-insegura
package alvo.desserializacao;

import java.io.ObjectInputStream;
import jakarta.servlet.http.HttpServletRequest;

class DesserializacaoCorreto {
    String ler(HttpServletRequest req) throws Exception {
        return new String(req.getInputStream().readAllBytes());
    }
}
