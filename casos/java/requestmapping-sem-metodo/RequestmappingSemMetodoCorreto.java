// correto: sentinel-spring-requestmapping-sem-method
package alvo.requestmappingsemmetodo;

import org.springframework.web.bind.annotation.RequestMapping;

class RequestmappingSemMetodoCorreto {
    @RequestMapping(value = "/clientes", method = org.springframework.web.bind.annotation.RequestMethod.GET)
    String listar() { return "[]"; }

}
