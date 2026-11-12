package alvo.cifrafraca;

import javax.crypto.Cipher;

class CifraFracaVulneravel {
    Cipher cifra() throws Exception {
        // alvo: sentinel-crypto-cifra-fraca
        return Cipher.getInstance("DES/ECB/PKCS5Padding");
    }
}
