// correto: sentinel-command-injection
package alvo.comandotaint;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

class ComandoTaintCorreto {
    void ping(HttpServletRequest req) throws Exception {
        String host = req.getParameter("host");
        if (!host.matches("[A-Za-z0-9.-]+")) { throw new IllegalArgumentException("host"); }
        new ProcessBuilder("ping", "-c", "1", host).start();
    }
}
