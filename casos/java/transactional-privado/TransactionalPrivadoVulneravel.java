package alvo.transactionalprivado;

import org.springframework.transaction.annotation.Transactional;

class TransactionalPrivadoVulneravel {
    // alvo: sentinel-java-transactional-privado
    @Transactional
    private void gravar() {}

}
