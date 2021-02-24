package phobosxd.veiculo;

public class Motocicleta extends Veiculo{
    private Integer cilindradas;

    public void setCilindradas(final Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Integer getCilindradas() {
        return cilindradas;
    }

    public Double getInposto() {
        return getValorVenal() * 0.03;
    }
}
