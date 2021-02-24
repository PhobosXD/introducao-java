package phobosxd.veiculo;

/**
 * @author PhobosXD
 * @since 2021-02-24
 * @version 2.0
 */
public class Carro extends Veiculo {
    private Integer quantidadePortas;

    public Carro(final String marca, final String modelo, final Double valorVenal) {
        super(marca, modelo, valorVenal);
    }

    public Carro(final String marca, final String modelo, final Double valorVenal, final Integer quantidadePortas) {
        super(marca, modelo, valorVenal);
        this.quantidadePortas = quantidadePortas;
    }

    public void setQuantidadePortas(final Integer quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public Integer getQuantidadePortas() {
        return quantidadePortas;
    }

    public Double getImposto() {
        return getValorVenal() * 0.07;
    }
}
