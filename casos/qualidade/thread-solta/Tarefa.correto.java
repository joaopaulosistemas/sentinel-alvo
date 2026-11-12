// correto: sentinel-mem-new-thread-solto
import java.util.concurrent.ExecutorService;
class Tarefa {
  void disparar(Runnable r, ExecutorService pool) {
    pool.execute(r);
  }
}
