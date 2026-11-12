package alvo.urlconnectiontimeout;

import java.net.HttpURLConnection;
import java.net.URL;

class UrlconnectionTimeoutVulneravel {
    HttpURLConnection abrir() throws Exception {
        // alvo: sentinel-int-urlconnection-sem-timeout
        HttpURLConnection c = (HttpURLConnection) new URL("https://api.parceiro.com.br/itens").openConnection();
        return c;
    }
}
