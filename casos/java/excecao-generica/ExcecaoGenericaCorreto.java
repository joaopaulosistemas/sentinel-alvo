// correto: sentinel-ee-lanca-excecao-generica
package alvo.excecaogenerica;


class ExcecaoGenericaCorreto {
    void validar(String cpf) {
        if (cpf == null) {
            throw new IllegalArgumentException("cpf obrigatório");
        }
    }
}
