package alvo.httpclienttimeout;

import java.net.http.HttpClient;

class HttpclientTimeoutVulneravel {
    HttpClient criar() {
        // alvo: sentinel-int-httpclient-sem-timeout
        return HttpClient.newHttpClient();
    }
}
