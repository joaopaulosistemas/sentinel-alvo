// correto: sentinel-xxe-parser-xml
package alvo.xxeparser;

import javax.xml.parsers.DocumentBuilderFactory;

class XxeParserCorreto {
    org.w3c.dom.Document ler(java.io.InputStream xml) throws Exception {
        DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
        f.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        return f.newDocumentBuilder().parse(xml);
    }
}
