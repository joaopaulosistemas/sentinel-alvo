class Tarefa {
  void disparar(Runnable r) {
    // alvo: sentinel-mem-new-thread-solto
    new Thread(r).start();
  }
}
