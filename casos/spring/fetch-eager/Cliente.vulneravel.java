import jakarta.persistence.*;
import java.util.List;
@Entity
class Cliente {
  // alvo: sentinel-spring-fetch-eager
  @OneToMany(fetch = FetchType.EAGER)
  private List<Object> pedidos;
}
