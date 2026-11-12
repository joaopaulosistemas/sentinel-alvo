// correto: sentinel-int-pool-ilimitado
import java.util.concurrent.*;
class Tarefas {
  ExecutorService pool() {
    return Executors.newFixedThreadPool(8);
  }
}
