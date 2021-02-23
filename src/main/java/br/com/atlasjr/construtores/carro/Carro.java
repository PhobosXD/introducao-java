package br.com.atlasjr.construtores.carro;

/**
 * @author Cazuza
 * @since 2021-02-23
 * @version 1.0
 */
public class Carro {
    final String marca;
    final String modelo;
    final Integer ano;
    String variante;

    /**
     * @author Cazuza
     * @since 2021-02-23
     * @description Constructor
     * @param modelo Modelo do carro.
     * @param marca Marca do carro.
     * @param ano Ano do carro.
     */
    public Carro(final String modelo, final String marca, final Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
}
