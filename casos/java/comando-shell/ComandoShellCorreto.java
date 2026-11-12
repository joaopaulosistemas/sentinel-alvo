// correto: sentinel-command-injection-shell
package alvo.comandoshell;

import jakarta.servlet.http.HttpServletRequest;

class ComandoShellCorreto {
    void executar(HttpServletRequest req) throws Exception {
        String arquivo = req.getParameter("arquivo");
        new ProcessBuilder("gzip", "--", arquivo).start();
    }
}
