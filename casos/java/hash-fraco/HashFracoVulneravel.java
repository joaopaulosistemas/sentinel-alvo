package alvo.hashfraco;

import java.security.MessageDigest;

class HashFracoVulneravel {
    byte[] resumo(byte[] dado) throws Exception {
        // alvo: sentinel-crypto-hash-fraco
        MessageDigest md = MessageDigest.getInstance("MD5");
        return md.digest(dado);
    }
}
