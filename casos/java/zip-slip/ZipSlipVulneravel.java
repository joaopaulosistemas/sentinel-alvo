package alvo.zipslip;

import java.io.File;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

class ZipSlipVulneravel {
    void extrair(ZipInputStream zip, File destino) throws Exception {
        ZipEntry e;
        while ((e = zip.getNextEntry()) != null) {
            // alvo: sentinel-zip-slip
            File saida = new File(destino, e.getName());
            java.nio.file.Files.copy(zip, saida.toPath());
        }
    }
}
