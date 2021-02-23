package br.com.atlasjr;

import br.com.atlasjr.imc.Imc;
import br.com.atlasjr.pessoa.Pessoa;

/**
 * @author Cazuza
 * @since 2021-02-23
 * @description Classe de execução da main.
 */
public class Programa {
    /**
     * @author Cazuza
     * @param args Argumentos da main.
     */
    public static void main(String[] args) {
        final Pessoa pessoa = new Pessoa("Igor", 1.8, 65.0);
        final var calculadorImc = new Imc();

        final var imc = calculadorImc.calcula(pessoa);

        System.out.printf("IMC = %.2f", imc);
    }
}
