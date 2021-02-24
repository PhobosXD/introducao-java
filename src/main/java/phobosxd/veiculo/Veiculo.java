package phobosxd.veiculo;

/**
 * @author PhobosXD
 * @since 2021-02-24
 * @version 1.0
 */
public class Veiculo {
    private String marca;
    private String modelo;
    private Double valorVenal;

    public void setMarca(final String marca) {
        this.marca = marca;
    }

    public void setModelo(final String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setValorVenal(final Double valorVenal) {
        this.valorVenal = valorVenal;
    }

    public Double getValorVenal() {
        return valorVenal;
    }

    public Double getImposto() {
        return valorVenal * 0.01;
    }
}