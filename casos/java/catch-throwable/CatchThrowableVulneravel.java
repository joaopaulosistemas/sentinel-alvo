package alvo.catchthrowable;

class CatchThrowableVulneravel {
    void rodar(Runnable tarefa) {
        // alvo: sentinel-java-catch-throwable
        try {
            tarefa.run();
        } catch (Throwable t) {
            System.err.println("falhou");
        }
    }
}
