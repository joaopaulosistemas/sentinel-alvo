package alvo.printstacktrace;


class PrintStackTraceVulneravel {
    void rodar(Runnable r) {
        try {
            r.run();
        } catch (RuntimeException e) {
            // alvo: sentinel-spring-print-stack-trace
            e.printStackTrace();
        }
    }
}
