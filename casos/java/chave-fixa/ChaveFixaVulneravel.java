package alvo.chavefixa;

import javax.crypto.spec.SecretKeySpec;

class ChaveFixaVulneravel {
    SecretKeySpec chave() {
        // alvo: sentinel-crypto-chave-fixa-no-codigo
        return new SecretKeySpec("0123456789abcdef".getBytes(), "AES");
    }
}
