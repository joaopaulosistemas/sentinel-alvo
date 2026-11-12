package alvo.excecaogenerica;


class ExcecaoGenericaVulneravel {
    void validar(String cpf) throws Exception {
        if (cpf == null) {
            // alvo: sentinel-ee-lanca-excecao-generica
            throw new Exception("cpf obrigatório");
        }
    }
}
