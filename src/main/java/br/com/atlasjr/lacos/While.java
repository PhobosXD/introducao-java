package br.com.atlasjr.lacos;

/**
 * @author Cazuza
 * @version 1.0
 * @since 2021-02-22
 * @param args Argumentos da main.
 */
public class While {
    /**
     * @author Cazuza
     * @version 1.0
     * @since 2021-02-22
     * @param args Argumentos da main.
     */
    public static void main(String[] args) {
        var x = 0;
        var y = 0;

        System.out.println("While");
        while (x < 10) {
            System.out.println(x);
            ++x;
        }

        System.out.println("DoWhile");
        do {
            ++y;
            System.out.println(y);
        } while (y < 10);
    }
}
