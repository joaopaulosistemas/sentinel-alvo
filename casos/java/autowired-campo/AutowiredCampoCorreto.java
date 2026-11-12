// correto: sentinel-java-autowired-campo
package alvo.autowiredcampo;

import org.springframework.beans.factory.annotation.Autowired;

class AutowiredCampoCorreto {
    private final Object repositorio;

    AutowiredCampoCorreto(Object repositorio) {
        this.repositorio = repositorio;
    }

}
