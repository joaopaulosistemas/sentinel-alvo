// correto: sentinel-snakeyaml-construtor-padrao
package alvo.snakeyaml;

import org.yaml.snakeyaml.Yaml;

class SnakeyamlCorreto {
    Object ler(String texto) {
        Yaml yaml = new Yaml(new org.yaml.snakeyaml.constructor.SafeConstructor(new org.yaml.snakeyaml.LoaderOptions()));
        return yaml.load(texto);
    }
}
