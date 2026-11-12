import jakarta.inject.Inject;
// alvo: sentinel-too-many-injections
class Servico {
  @Inject Dep0 d0;
  @Inject Dep1 d1;
  @Inject Dep2 d2;
  @Inject Dep3 d3;
  @Inject Dep4 d4;
  @Inject Dep5 d5;
  @Inject Dep6 d6;
  @Inject Dep7 d7;
  @Inject Dep8 d8;
}
