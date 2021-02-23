package br.com.atlasjr.pessoa;

/**
 * @author Cazuza
 * @since 2021-02-23
 */
public class Pessoa {
    private String nome;
    private Double altura;
    private Double peso;

    /**
     * @author Cazuza
     * @since 2021-02-23
     * @description Construtor da classe Pessoa.
     * @param nome Nome da pessoa.
     * @param altura Altura da pessoa.
     * @param peso Peso da pessoa.
     */
    public Pessoa(final String nome, final Double altura, final Double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getPeso() {
        return peso;
    }
}
