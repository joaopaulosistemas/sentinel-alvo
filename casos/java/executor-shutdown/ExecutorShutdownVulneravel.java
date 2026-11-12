package alvo.executorshutdown;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecutorShutdownVulneravel {
    void rodar(Runnable r) {
        // alvo: sentinel-mem-executor-sem-shutdown
        ExecutorService pool = Executors.newFixedThreadPool(4);
        pool.submit(r);
    }
}
