package alvo.xssrefletido;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

class XssRefletidoVulneravel {
    void saudar(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String nome = req.getParameter("nome");
        // alvo: sentinel-xss-response-write
        resp.getWriter().write("<h1>Olá, " + nome + "</h1>");
    }
}
