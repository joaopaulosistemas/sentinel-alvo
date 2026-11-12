// correto: sentinel-jackson-default-typing
package alvo.jacksontyping;

import com.fasterxml.jackson.databind.ObjectMapper;

class JacksonTypingCorreto {
    ObjectMapper criar() {
        return new ObjectMapper();
    }
}
