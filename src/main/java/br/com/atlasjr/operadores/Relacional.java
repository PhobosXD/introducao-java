package br.com.atlasjr.operadores;

/**
 * @author Cazuza
 * @version 1.0
 * @since 2021-02-22
 */
public class Relacional {
    /**
     * @author Cazuza
     * @version 1.0
     * @since 2021-02-22
     * @param args Argumentos da main.
     */
    public static void main(String[] args) {
        final var num = 10;

        if (num > 5) {
            System.out.println("O numero eh maior que 5");
        } else if (num < 5) {
            System.out.println("O numero eh menor que 5");
        } else if (num >= 10) {
            System.out.println("O numero eh maior ou igual a 10");
        } else if (num <= 9) {
            System.out.println("O numero eh menor ou igual a 9");
        }
    }
}
