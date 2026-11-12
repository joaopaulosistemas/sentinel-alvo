package alvo.redirectservlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

class RedirectServletVulneravel {
    void ir(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        // alvo: sentinel-open-redirect
        resp.sendRedirect(req.getParameter("next"));
    }
}
