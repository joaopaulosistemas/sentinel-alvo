// correto: sentinel-zip-slip
package alvo.zipslip;

import java.io.File;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

class ZipSlipCorreto {
    void extrair(ZipInputStream zip, File destino) throws Exception {
        ZipEntry e;
        while ((e = zip.getNextEntry()) != null) {
            File saida = new File(destino, e.getName()).getCanonicalFile();
            if (!saida.toPath().startsWith(destino.getCanonicalFile().toPath())) {
                throw new SecurityException("entrada fora do destino");
            }
            java.nio.file.Files.copy(zip, saida.toPath());
        }
    }
}
