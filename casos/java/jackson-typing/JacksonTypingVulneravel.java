package alvo.jacksontyping;

import com.fasterxml.jackson.databind.ObjectMapper;

class JacksonTypingVulneravel {
    ObjectMapper criar() {
        ObjectMapper m = new ObjectMapper();
        // alvo: sentinel-jackson-default-typing
        m.enableDefaultTyping();
        return m;
    }
}
