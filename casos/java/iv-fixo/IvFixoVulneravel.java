package alvo.ivfixo;

import javax.crypto.spec.IvParameterSpec;

class IvFixoVulneravel {
    IvParameterSpec iv() {
        // alvo: sentinel-crypto-iv-fixo
        return new IvParameterSpec(new byte[16]);
    }
}
