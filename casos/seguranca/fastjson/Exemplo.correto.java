// correto: sentinel-fastjson-autotype
class Exemplo {
  void a(String json) {
    com.alibaba.fastjson.JSON.parseObject(json, Exemplo.class);
  }
}
