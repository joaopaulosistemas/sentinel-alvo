// correto: sentinel-chave-assimetrica-curta
package alvo.rsacurta;

import java.security.KeyPairGenerator;

class RsaCurtaCorreto {
    java.security.KeyPair par() throws Exception {
        KeyPairGenerator g = KeyPairGenerator.getInstance("RSA");
        g.initialize(3072);
        return g.generateKeyPair();
    }
}
