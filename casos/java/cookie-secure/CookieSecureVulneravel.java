package alvo.cookiesecure;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Cookie;

class CookieSecureVulneravel {
    void sessao(HttpServletResponse resp, String id) {
        // alvo: sentinel-cookie-sem-secure
        Cookie c = new Cookie("SESSAO", id);
        c.setHttpOnly(true);
        resp.addCookie(c);
    }
}
