// correto: sentinel-spring-print-stack-trace
package alvo.printstacktrace;


class PrintStackTraceCorreto {
    void rodar(Runnable r, org.slf4j.Logger log) {
        try {
            r.run();
        } catch (RuntimeException e) {
            log.error("falha", e);
        }
    }
}
