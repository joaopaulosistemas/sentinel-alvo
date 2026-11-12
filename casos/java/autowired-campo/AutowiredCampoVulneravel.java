package alvo.autowiredcampo;

import org.springframework.beans.factory.annotation.Autowired;

class AutowiredCampoVulneravel {
    // alvo: sentinel-java-autowired-campo
    @Autowired
    private Object repositorio;

}
