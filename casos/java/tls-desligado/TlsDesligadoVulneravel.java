package alvo.tlsdesligado;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;

class TlsDesligadoVulneravel {
    void configurar() {
        // alvo: sentinel-api-tls-validation-disabled
        HttpsURLConnection.setDefaultHostnameVerifier((host, sessao) -> true);
    }
}
