import jakarta.ws.rs.*;
// alvo: sentinel-owasp-a01-endpoint-sem-autorizacao
@Path("/contas")
class Recurso {
  @GET public String ler() { return "x"; }
}
