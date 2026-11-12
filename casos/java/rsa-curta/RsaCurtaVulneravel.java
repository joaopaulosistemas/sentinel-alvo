package alvo.rsacurta;

import java.security.KeyPairGenerator;

class RsaCurtaVulneravel {
    java.security.KeyPair par() throws Exception {
        KeyPairGenerator g = KeyPairGenerator.getInstance("RSA");
        // alvo: sentinel-chave-assimetrica-curta
        g.initialize(1024);
        return g.generateKeyPair();
    }
}
