package alvo.resttemplatetimeout;

import org.springframework.web.client.RestTemplate;

class ResttemplateTimeoutVulneravel {
    RestTemplate cliente() {
        // alvo: sentinel-int-resttemplate-sem-timeout
        return new RestTemplate();
    }
}
