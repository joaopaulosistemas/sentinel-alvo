package alvo.httpclientapache;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;

class HttpclientApacheVulneravel {
    HttpClient criar() {
        // alvo: sentinel-int-httpclient-sem-timeout
        return HttpClients.createDefault();
    }
}
