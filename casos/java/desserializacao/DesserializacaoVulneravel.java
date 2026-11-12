package alvo.desserializacao;

import java.io.ObjectInputStream;
import jakarta.servlet.http.HttpServletRequest;

class DesserializacaoVulneravel {
    Object ler(HttpServletRequest req) throws Exception {
        // alvo: sentinel-desserializacao-insegura
        ObjectInputStream in = new ObjectInputStream(req.getInputStream());
        return in.readObject();
    }
}
