// correto: sentinel-java-catch-throwable
package alvo.catchthrowable;


class CatchThrowableCorreto {
    void rodar(Runnable tarefa) {
        try {
            tarefa.run();
        } catch (RuntimeException e) {
            System.err.println("falhou");
        }
    }
}
