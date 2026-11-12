package alvo.corscuringa;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

class CorsCuringaVulneravel {
@RestController
    // alvo: sentinel-api-cors-wildcard
    @CrossOrigin(origins = "*")
    static class Contas {
        @GetMapping("/contas")
        String listar() { return "[]"; }
    }
}
