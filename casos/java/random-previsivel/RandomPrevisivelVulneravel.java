package alvo.randomprevisivel;

import java.util.Random;

class RandomPrevisivelVulneravel {
    String novoToken() {
        // alvo: sentinel-crypto-random-previsivel
        Random r = new Random();
        return Long.toHexString(r.nextLong());
    }
}
