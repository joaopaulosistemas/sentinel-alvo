// correto: sentinel-crypto-random-previsivel
package alvo.randomprevisivel;

import java.util.Random;

class RandomPrevisivelCorreto {
    String novoToken() {
        java.security.SecureRandom r = new java.security.SecureRandom();
        return Long.toHexString(r.nextLong());
    }
}
