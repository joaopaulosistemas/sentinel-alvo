package alvo.comandoshell;

import jakarta.servlet.http.HttpServletRequest;

class ComandoShellVulneravel {
    void executar(HttpServletRequest req) throws Exception {
        String arquivo = req.getParameter("arquivo");
        // alvo: sentinel-command-injection-shell
        Runtime.getRuntime().exec(new String[] {"sh", "-c", "gzip " + arquivo});
    }
}
