package br.com.atlasjr.interfaces;

/**
 * @author Cazuza
 * @version 1.0
 * @since 2021-02-22
 */
public interface Carro {
    String marca();

    default void ligar() {
        System.out.println("Ligando o carro!");
    }
}
