// correto: sentinel-ee-ejb-sem-interface
import jakarta.ejb.Stateless;
@Stateless
public class Servico implements ServicoLocal {
  public void gravar() {}
}
interface ServicoLocal { void gravar(); }
