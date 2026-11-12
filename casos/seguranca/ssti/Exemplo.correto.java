// correto: sentinel-ssti-modelo-variavel
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
class Exemplo {
  void a(VelocityContext ctx, java.io.Writer w) {
    Velocity.evaluate(ctx, w, "t", "Ola $nome");
  }
}
