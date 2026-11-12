// correto: sentinel-jpa-muitos-para-um-eager-padrao
import jakarta.persistence.*;
@Entity
class Pedido {
  @ManyToOne(fetch = FetchType.LAZY)
  private Cliente cliente;
}
