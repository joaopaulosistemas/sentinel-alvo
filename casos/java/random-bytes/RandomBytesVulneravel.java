package alvo.randombytes;

import java.util.Random;

class RandomBytesVulneravel {
    byte[] novaChave() {
        byte[] chave = new byte[32];
        // alvo: sentinel-crypto-random-nextbytes
        new Random().nextBytes(chave);
        return chave;
    }
}
