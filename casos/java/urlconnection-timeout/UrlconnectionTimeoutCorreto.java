// correto: sentinel-int-urlconnection-sem-timeout
package alvo.urlconnectiontimeout;

import java.net.HttpURLConnection;
import java.net.URL;

class UrlconnectionTimeoutCorreto {
    HttpURLConnection abrir() throws Exception {
        HttpURLConnection c = (HttpURLConnection) new URL("https://api.parceiro.com.br/itens").openConnection();
        c.setConnectTimeout(2000);
        c.setReadTimeout(5000);
        return c;
    }
}
