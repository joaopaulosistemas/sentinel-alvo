// correto: sentinel-crypto-random-nextbytes
package alvo.randombytes;

import java.util.Random;

class RandomBytesCorreto {
    byte[] novaChave() {
        byte[] chave = new byte[32];
        new java.security.SecureRandom().nextBytes(chave);
        return chave;
    }
}
