// correto: sentinel-cookie-sem-secure
package alvo.cookiesecure;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Cookie;

class CookieSecureCorreto {
    void sessao(HttpServletResponse resp, String id) {
        Cookie c = new Cookie("SESSAO", id);
        c.setHttpOnly(true);
        c.setSecure(true);
        resp.addCookie(c);
    }
}
