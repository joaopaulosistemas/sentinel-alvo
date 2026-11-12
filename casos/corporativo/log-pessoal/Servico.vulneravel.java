import java.util.logging.Logger;
class Servico {
  static final Logger LOG = Logger.getLogger("s");
  void entrar(String cpf, String senha) {
    // alvo: sentinel-ee-log-dado-pessoal
    LOG.info("login cpf=" + cpf + " senha=" + senha);
  }
}
