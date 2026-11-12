// correto: sentinel-mem-executor-sem-shutdown
package alvo.executorshutdown;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecutorShutdownCorreto {
    void rodar(Runnable r) {
        ExecutorService pool = Executors.newFixedThreadPool(4);
        try {
            pool.submit(r);
        } finally {
            pool.shutdown();
        }
    }
}
