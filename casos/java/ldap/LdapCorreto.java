// correto: sentinel-ldap-injection
package alvo.ldap;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javax.naming.directory.DirContext;
import javax.naming.directory.SearchControls;

class LdapCorreto {
    void achar(HttpServletRequest req, DirContext ctx) throws Exception {
        String uid = req.getParameter("uid");
        ctx.search("ou=pessoas,dc=empresa,dc=com", "(uid={0})", new Object[] {uid}, new SearchControls());
    }
}
