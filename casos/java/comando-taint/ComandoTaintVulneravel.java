package alvo.comandotaint;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

class ComandoTaintVulneravel {
    void ping(HttpServletRequest req) throws Exception {
        String host = req.getParameter("host");
        // alvo: sentinel-command-injection
        Runtime.getRuntime().exec("ping -c 1 " + host);
    }
}
