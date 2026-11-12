package alvo.requestmappingsemmetodo;

import org.springframework.web.bind.annotation.RequestMapping;

class RequestmappingSemMetodoVulneravel {
    // alvo: sentinel-spring-requestmapping-sem-method
    @RequestMapping("/clientes")
    String listar() { return "[]"; }

}
