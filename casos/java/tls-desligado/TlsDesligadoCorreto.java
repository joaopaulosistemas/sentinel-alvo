// correto: sentinel-api-tls-validation-disabled
package alvo.tlsdesligado;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;

class TlsDesligadoCorreto {
    void configurar() {
        HttpsURLConnection.setDefaultHostnameVerifier(HttpsURLConnection.getDefaultHostnameVerifier());
    }
}
