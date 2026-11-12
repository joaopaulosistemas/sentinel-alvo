// correto: sentinel-crypto-hash-fraco
package alvo.hashfraco;

import java.security.MessageDigest;

class HashFracoCorreto {
    byte[] resumo(byte[] dado) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        return md.digest(dado);
    }
}
