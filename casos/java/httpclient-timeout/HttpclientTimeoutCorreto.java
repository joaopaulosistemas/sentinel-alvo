// correto: sentinel-int-httpclient-sem-timeout
package alvo.httpclienttimeout;

import java.net.http.HttpClient;

class HttpclientTimeoutCorreto {
    HttpClient criar() {
        return HttpClient.newBuilder().connectTimeout(java.time.Duration.ofSeconds(2)).build();
    }
}
