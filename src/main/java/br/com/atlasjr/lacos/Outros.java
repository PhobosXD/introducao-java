package br.com.atlasjr.lacos;

import java.util.stream.IntStream;

/**
 * @author Cazuza
 * @version 1.0
 * @since 2021-02-22
 */
public class Outros {
    /**
     * @author Cazuza
     * @version 1.0
     * @since 2021-02-22
     * @param args Argumentos da main.
     */
    public static void main(String[] args) {
        System.out.println("Stream.of");
        IntStream.of(1, 3, 7).forEach(n -> {
            System.out.println(n);
        });

        System.out.println("Stream.range");
        IntStream.range(0, 3).forEach(n -> {
            System.out.println(n);
        });
    }
}
