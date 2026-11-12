// correto: sentinel-java-thread-manual
package alvo.threadmanual;


class ThreadManualCorreto {
    void processar(Runnable r, java.util.concurrent.ExecutorService pool) {
        pool.submit(r);
    }
}
