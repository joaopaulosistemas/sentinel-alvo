// correto: sentinel-crypto-chave-fixa-no-codigo
package alvo.chavefixa;

import javax.crypto.spec.SecretKeySpec;

class ChaveFixaCorreto {
    SecretKeySpec chave() {
        return new SecretKeySpec(java.util.Base64.getDecoder().decode(System.getenv("CHAVE_AES")), "AES");
    }
}
