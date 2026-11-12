// correto: sentinel-boas-spring-value-espalhado
import org.springframework.boot.context.properties.ConfigurationProperties;
@ConfigurationProperties("parceiro")
record ParceiroProps(String url) {}
