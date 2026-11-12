package alvo.pathtraversalservlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;

class PathTraversalServletVulneravel {
    FileInputStream abrir(HttpServletRequest req) throws Exception {
        String arquivo = req.getParameter("arquivo");
        // alvo: sentinel-servlet-path-traversal
        return new FileInputStream(new File("/dados/relatorios/" + arquivo));
    }
}
