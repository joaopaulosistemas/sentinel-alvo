// correto: sentinel-owasp-a01-endpoint-sem-autorizacao
import jakarta.ws.rs.*;
import jakarta.annotation.security.RolesAllowed;
@Path("/contas")
@RolesAllowed("admin")
class Recurso {
  @GET public String ler() { return "x"; }
}
