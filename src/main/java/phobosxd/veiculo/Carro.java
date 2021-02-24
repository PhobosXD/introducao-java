package phobosxd.veiculo;

/**
 * @author PhobosXD
 * @since 2021-02-24
 * @version 1.0
 */
public class Carro extends Veiculo {
    private Integer quantidadePortas;

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
