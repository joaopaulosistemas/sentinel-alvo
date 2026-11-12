// correto: sentinel-crypto-cifra-fraca
package alvo.cifrafraca;

import javax.crypto.Cipher;

class CifraFracaCorreto {
    Cipher cifra() throws Exception {
        return Cipher.getInstance("AES/GCM/NoPadding");
    }
}
