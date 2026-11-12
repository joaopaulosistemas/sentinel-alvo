// correto: sentinel-servlet-path-traversal
package alvo.pathtraversalservlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;

class PathTraversalServletCorreto {
    FileInputStream abrir(HttpServletRequest req) throws Exception {
        File base = new File("/dados/relatorios").getCanonicalFile();
        File alvo = new File(base, req.getParameter("arquivo")).getCanonicalFile();
        if (!alvo.toPath().startsWith(base.toPath())) { throw new SecurityException("fora da pasta"); }
        return new FileInputStream(alvo);
    }
}
