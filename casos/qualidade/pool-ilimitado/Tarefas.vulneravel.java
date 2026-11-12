import java.util.concurrent.*;
class Tarefas {
  ExecutorService pool() {
    // alvo: sentinel-int-pool-ilimitado
    return Executors.newCachedThreadPool();
  }
}
