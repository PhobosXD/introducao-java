package br.com.atlasjr.enums;

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
        System.out.println(TipoVeiculo.TERRESTRE);
        System.out.println(TipoVeiculo.AQUATICO);

        for (TipoVeiculo tipo : TipoVeiculo.values()) {
            System.out.println("Tipo: " + tipo);
        }

        System.out.println("Código do status OPEN " + Status.OPEN.getCod());
        System.out.println("Texto do status CLOSE " + Status.CLOSE.getTexto());
    }
}
