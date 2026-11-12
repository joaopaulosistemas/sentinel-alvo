// correto: sentinel-xxe-outros-parsers
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
class Exemplo {
  void a() throws Exception {
    XMLReader r = XMLReaderFactory.createXMLReader();
    r.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
  }
}
