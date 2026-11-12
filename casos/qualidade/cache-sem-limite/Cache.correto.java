// correto: sentinel-mem-cache-sem-limite
import com.github.benmanes.caffeine.cache.*;
class Cache {
  Cache<String, Object> criar() {
    return Caffeine.newBuilder().maximumSize(1000).expireAfterWrite(java.time.Duration.ofMinutes(10)).build();
  }
}
