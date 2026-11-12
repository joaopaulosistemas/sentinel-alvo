// correto: sentinel-ee-log-dado-pessoal
import java.util.logging.Logger;
class Servico {
  static final Logger LOG = Logger.getLogger("s");
  void entrar(long idUsuario) {
    LOG.info("login usuario=" + idUsuario);
  }
}
