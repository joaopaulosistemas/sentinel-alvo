// correto: sentinel-int-resttemplate-sem-timeout
package alvo.resttemplatetimeout;

import org.springframework.web.client.RestTemplate;

class ResttemplateTimeoutCorreto {
    RestTemplate cliente() {
        org.springframework.http.client.SimpleClientHttpRequestFactory f = new org.springframework.http.client.SimpleClientHttpRequestFactory();
        f.setConnectTimeout(2000);
        f.setReadTimeout(5000);
        return new RestTemplate(f);
    }
}
