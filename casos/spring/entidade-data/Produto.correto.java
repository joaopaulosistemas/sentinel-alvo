// correto: sentinel-spring-entidade-com-data
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
class Produto {
  private Long id;
}
