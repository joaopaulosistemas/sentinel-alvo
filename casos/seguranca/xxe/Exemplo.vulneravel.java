import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
class Exemplo {
  void a() throws Exception {
    // alvo: sentinel-xxe-outros-parsers
    XMLReader r = XMLReaderFactory.createXMLReader();
  }
}
