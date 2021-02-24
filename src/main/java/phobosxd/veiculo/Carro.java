package phobosxd.veiculo;

public class Carro extends Veiculo{
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
