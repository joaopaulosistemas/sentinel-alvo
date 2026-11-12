// correto: sentinel-xss-response-write
package alvo.xssrefletido;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

class XssRefletidoCorreto {
    void saudar(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String nome = org.springframework.web.util.HtmlUtils.htmlEscape(req.getParameter("nome"));
        resp.getWriter().write("<h1>Olá, " + nome + "</h1>");
    }
}
