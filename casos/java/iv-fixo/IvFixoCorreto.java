// correto: sentinel-crypto-iv-fixo
package alvo.ivfixo;

import javax.crypto.spec.IvParameterSpec;

class IvFixoCorreto {
    IvParameterSpec iv() {
        byte[] b = new byte[16];
        new java.security.SecureRandom().nextBytes(b);
        return new IvParameterSpec(b);
    }
}
