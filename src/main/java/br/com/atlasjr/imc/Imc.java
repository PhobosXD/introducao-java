package br.com.atlasjr.imc;

import br.com.atlasjr.pessoa.Pessoa;

/**
 * @author Cazuza
 * @since 2021-02-23
 */
public class Imc {
    /**
     * @author Cazuza
     * @since 2021-02-23
     * @description Calcula o IMC a partir de uma classe pessoa.
     * @param pessoa Objeto da classe pessoa.
     * @return Retorna um Double.
     */
    public Double calcula(final Pessoa pessoa) {
        final var altura = pessoa.getAltura();
        final var imc = pessoa.getPeso() / (altura * altura);

        return imc;
    }
}
