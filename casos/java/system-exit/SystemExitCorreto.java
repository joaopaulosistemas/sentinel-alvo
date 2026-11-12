// correto: sentinel-system-exit
package alvo.systemexit;


class SystemExitCorreto {
    void falhou() {
        throw new IllegalStateException("falha irrecuperável");
    }
}
