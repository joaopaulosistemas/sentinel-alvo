// correto: sentinel-too-many-injections
import jakarta.inject.Inject;
class Servico {
  @Inject Dep0 d0;
  @Inject Dep1 d1;
}
