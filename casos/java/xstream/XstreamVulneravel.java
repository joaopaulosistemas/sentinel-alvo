package alvo.xstream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.AnyTypePermission;

class XstreamVulneravel {
    Object ler(String xml) {
        // alvo: sentinel-xstream-qualquer-tipo
        XStream x = new XStream();
        x.addPermission(AnyTypePermission.ANY);
        return x.fromXML(xml);
    }
}
