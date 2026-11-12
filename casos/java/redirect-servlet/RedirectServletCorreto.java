// correto: sentinel-open-redirect
package alvo.redirectservlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

class RedirectServletCorreto {
    void ir(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String next = req.getParameter("next");
        resp.sendRedirect(next != null && next.startsWith("/") && !next.startsWith("//") ? next : "/inicio");
    }
}
