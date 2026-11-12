import com.github.benmanes.caffeine.cache.*;
class Cache {
  Cache<String, Object> criar() {
    // alvo: sentinel-mem-cache-sem-limite
    return Caffeine.newBuilder().build();
  }
}
