package alvo.xxeparser;

import javax.xml.parsers.DocumentBuilderFactory;

class XxeParserVulneravel {
    org.w3c.dom.Document ler(java.io.InputStream xml) throws Exception {
        // alvo: sentinel-xxe-parser-xml
        DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
        return f.newDocumentBuilder().parse(xml);
    }
}
