package alvo.httprequesttimeout;

import java.net.URI;
import java.net.http.HttpRequest;

class HttprequestTimeoutVulneravel {
    HttpRequest montar() {
        // alvo: sentinel-int-httprequest-sem-timeout
        return HttpRequest.newBuilder(URI.create("https://api.parceiro.com.br/itens")).GET().build();
    }
}
