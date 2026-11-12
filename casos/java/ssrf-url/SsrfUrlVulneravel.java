package alvo.ssrfurl;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.net.URL;

class SsrfUrlVulneravel {
    java.io.InputStream baixar(HttpServletRequest req) throws Exception {
        // alvo: sentinel-ssrf-url-do-parametro
        return new URL(req.getParameter("url")).openStream();
    }
}
