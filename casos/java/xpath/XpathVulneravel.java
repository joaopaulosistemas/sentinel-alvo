package alvo.xpath;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

class XpathVulneravel {
    String achar(HttpServletRequest req, org.w3c.dom.Document doc) throws Exception {
        String nome = req.getParameter("nome");
        XPath xp = XPathFactory.newInstance().newXPath();
        // alvo: sentinel-xpath-injection
        return xp.evaluate("//usuario[nome='" + nome + "']/email", doc);
    }
}
