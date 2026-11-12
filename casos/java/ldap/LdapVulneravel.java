package alvo.ldap;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javax.naming.directory.DirContext;
import javax.naming.directory.SearchControls;

class LdapVulneravel {
    void achar(HttpServletRequest req, DirContext ctx) throws Exception {
        String uid = req.getParameter("uid");
        // alvo: sentinel-ldap-injection
        ctx.search("ou=pessoas,dc=empresa,dc=com", "(uid=" + uid + ")", new SearchControls());
    }
}
