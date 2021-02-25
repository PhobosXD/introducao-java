package phobosxd.veiculo;

/**
 * @author PhobosXD
 * @since 2021-02-24
 * @version 2.0
 */
public class Motocicleta extends Veiculo {
    private Integer cilindradas;

    public Motocicleta(final String marca, final String modelo, final Double valorVenal) {
        super(marca, modelo, valorVenal);
    }

    /**
     * @author PhobosXD
     * @since 2021-02-24
     * @param marca String: Atributo marca da classe.
     * @param modelo String: Atributo modelo da classe.
     * @param valorVenal Double: Atributo valorVenal da classe.
     * @param cilindradas Integer: Atributo cilindradas da
     *                    classe.
     */
    public Motocicleta(
            final String marca,
            final String modelo,
            final Double valorVenal,
            final Integer cilindradas) {

        super(marca, modelo, valorVenal);
        this.cilindradas = cilindradas;
    }

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
