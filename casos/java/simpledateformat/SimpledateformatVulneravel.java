package alvo.simpledateformat;

import java.text.SimpleDateFormat;

class SimpledateformatVulneravel {
    // alvo: sentinel-java-simpledateformat-estatico
    private static final SimpleDateFormat FORMATO = new SimpleDateFormat("dd/MM/yyyy");

}
