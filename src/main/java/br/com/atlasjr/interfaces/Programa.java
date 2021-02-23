package br.com.atlasjr.interfaces;

/**
 * @author Cazuza
 * @version 1.0
 * @since 2021-02-22
 */
public class Programa {
    /**
     * @author Cazuza
     * @version 1.0
     * @since 2021-02-22
     * @param args Argumentos da main.
     */
    public static void main(String[] args) {
        final Gol gol = new Gol();
        System.out.println("Marca do Gol: " + gol.marca());
        gol.ligar();
    }
}
