package alvo.redirectaberto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

class RedirectAbertoVulneravel {
    @GetMapping("/sair")
    String sair(@RequestParam String destino) {
        // alvo: sentinel-open-redirect-spring
        return "redirect:" + destino;
    }
}
