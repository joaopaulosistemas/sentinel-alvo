import jakarta.persistence.*;
@Entity
class Pedido {
  // alvo: sentinel-jpa-muitos-para-um-eager-padrao
  @ManyToOne
  private Cliente cliente;
}
