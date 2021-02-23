package br.com.atlasjr.strings;

/**
 * @author Cazuza
 * @version 1.0
 * @since 2021-02-22
 */
public class Strings {
    /**
     * @author Cazuza
     * @version 1.0
     * @since 2021-02-22
     * @param args Argumentos da main.
     */
    public static void main(String[] args) {
        /*
        * A função toCharArray transforma strings em vetores de char.
        */
        var string = "a b c d e f g";
        var stringarray = string.toCharArray();
        System.out.println(stringarray[2]);

        /*
        O métoro split("a") transforma uma string em um array de strings.
        Os elementos que farão parte desse array serão separados pelo caracter passado como
        parâmetro para a função.
         */
        string = "Aula de Java";
        var stringSplit = string.split(" ");
        System.out.println(stringSplit[2]);
    }
}
