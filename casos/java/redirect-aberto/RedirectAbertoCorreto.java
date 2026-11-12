// correto: sentinel-open-redirect-spring
package alvo.redirectaberto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

class RedirectAbertoCorreto {
    @GetMapping("/sair")
    String sair(@RequestParam String destino) {
        return "redirect:/inicio";
    }
}
