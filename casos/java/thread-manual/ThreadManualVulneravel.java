package alvo.threadmanual;


class ThreadManualVulneravel {
    void processar(Runnable r) {
        // alvo: sentinel-java-thread-manual
        Thread t = new Thread(r);
        t.start();
    }
}
