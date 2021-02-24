package phobosxd.veiculo;

/**
 * @author PhobosXD
 * @since 2021-02-24
 * @version 1.0
 */
public class Motocicleta extends Veiculo {
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
