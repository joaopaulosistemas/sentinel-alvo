import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
class Exemplo {
  void a(String modelo, VelocityContext ctx, java.io.Writer w) {
    // alvo: sentinel-ssti-modelo-variavel
    Velocity.evaluate(ctx, w, "t", modelo);
  }
}
