package alvo.snakeyaml;

import org.yaml.snakeyaml.Yaml;

class SnakeyamlVulneravel {
    Object ler(String texto) {
        // alvo: sentinel-snakeyaml-construtor-padrao
        Yaml yaml = new Yaml();
        return yaml.load(texto);
    }
}
