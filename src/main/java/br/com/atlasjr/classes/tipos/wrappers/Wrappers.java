package br.com.atlasjr.classes.tipos.wrappers;

/**
 * @author Cazuza
 * @version 1.0
 * @since 2021-02-22
 */
public class Wrappers {
    /**
     * @author Cazuza
     * @version 1.0
     * @since 2021-02-22
     * @param args Argumentos da main.
     */
    public static void main(String[] args) {
        /*
         * Os wrappers não são tipos. Eles são classes correspondentes aos tipos primários.
         * Por serem classes, eles podem ser atribuídos com null.
         * Os valores retornados pelos métodos os wrappers podem ser atribuídos à tipos primitivos.
         */

        Byte b = null;    //byte

        Character c = null;   //char

        Short s = null;   //short

        Integer i = null; //int

        Long l = null;    //long

        Float f = null;   //float

        Double d = null;  //double

        //O Wrapper Boolean pode retornar tipos a partir de strings.
        Boolean bool = null; //boolean
        Boolean b1 = Boolean.getBoolean("false");
        Boolean b2 = Boolean.valueOf("true");
    }
}
