// correto: sentinel-spring-fetch-eager
import jakarta.persistence.*;
import java.util.List;
@Entity
class Cliente {
  @OneToMany(fetch = FetchType.LAZY)
  private List<Object> pedidos;
}
