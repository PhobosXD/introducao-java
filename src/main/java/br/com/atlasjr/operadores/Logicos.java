package br.com.atlasjr.operadores;

/**
 * @author Cazuza
 * @version 1.0
 * @since 2021-02-22
 */
public class Logicos {
    /**
     * @author Cazuza
     * @version 1.0
     * @since 2021-02-22
     * @param args Argumentos da main.
     */
    public static void main(String[] args) {
        final var num = 5;
        final var letra = 'a';

        /*
         * Para shor circuit utiliza-se && ou ||.
         * Para long circuit utiliza-se & ou |.s
         */
        if (num == 5 && letra == 'a') {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (num > 5 || letra == 'b') {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
