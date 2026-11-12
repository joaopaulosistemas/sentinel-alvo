// correto: sentinel-api-cors-wildcard
package alvo.corscuringa;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

class CorsCuringaCorreto {
@RestController
    @CrossOrigin(origins = "https://app.exemplo.com.br")
    static class Contas {
        @GetMapping("/contas")
        String listar() { return "[]"; }
    }
}
