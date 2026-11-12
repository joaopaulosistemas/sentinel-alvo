// correto: sentinel-xstream-qualquer-tipo
package alvo.xstream;

import com.thoughtworks.xstream.XStream;

class XstreamCorreto {
    Object ler(String xml) {
        XStream x = new XStream();
        x.allowTypes(new Class[] {java.util.ArrayList.class});
        return x.fromXML(xml);
    }
}
