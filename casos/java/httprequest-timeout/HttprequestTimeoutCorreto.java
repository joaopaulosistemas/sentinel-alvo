// correto: sentinel-int-httprequest-sem-timeout
package alvo.httprequesttimeout;

import java.net.URI;
import java.net.http.HttpRequest;

class HttprequestTimeoutCorreto {
    HttpRequest montar() {
        return HttpRequest.newBuilder(URI.create("https://api.parceiro.com.br/itens"))
                .timeout(java.time.Duration.ofSeconds(5)).GET().build();
    }
}
