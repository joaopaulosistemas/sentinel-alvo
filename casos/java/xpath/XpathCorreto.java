// correto: sentinel-xpath-injection
package alvo.xpath;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

class XpathCorreto {
    String achar(HttpServletRequest req, org.w3c.dom.Document doc) throws Exception {
        XPath xp = XPathFactory.newInstance().newXPath();
        xp.setXPathVariableResolver(nome -> req.getParameter("nome"));
        return xp.evaluate("//usuario[nome=$nome]/email", doc);
    }
}
