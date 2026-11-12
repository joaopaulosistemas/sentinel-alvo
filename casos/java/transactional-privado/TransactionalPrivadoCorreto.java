// correto: sentinel-java-transactional-privado
package alvo.transactionalprivado;

import org.springframework.transaction.annotation.Transactional;

class TransactionalPrivadoCorreto {
    @Transactional
    public void gravar() {}

}
