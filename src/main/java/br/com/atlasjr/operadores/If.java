package br.com.atlasjr.operadores;

/**
 * @author Cazuza
 * @version 1.0
 * @since 2021-02-22
 */
public class If {
    /**
     * @author Cazuza
     * @version 1.0
     * @since 2021-02-22
     * @param args Argumentos da main.
     */
    public static void main(String[] args) {
        final var condicao = false;

        if (condicao) {
            System.out.println("A condicao eh verdadeira");
        } else {
            System.out.println("A condicao eh falsa");
        }

        final var ternario = condicao ? "A condicao eh verdadeira" : "A condicao eh falsa";
        System.out.println(ternario);
    }
}
