// correto: sentinel-ssrf-url-do-parametro
package alvo.ssrfurl;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.net.URL;

class SsrfUrlCorreto {
    java.io.InputStream baixar(HttpServletRequest req) throws Exception {
        return new URL("https://api.parceiro.com.br/cotacao").openStream();
    }
}
