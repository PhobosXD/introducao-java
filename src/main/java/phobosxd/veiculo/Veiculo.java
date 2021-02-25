package phobosxd.veiculo;

import java.util.Objects;

/**
 * @author PhobosXD
 * @since 2021-02-24
 * @version 3.0
 */
public abstract class Veiculo {
    private String marca;
    private String modelo;
    private Double valorVenal;

    /**
     * @author PhobosXD
     * @since 2021-02-24
     * @param marca String: Atributo marca da classe.
     * @param modelo String: Atributo modelo da classe.
     * @param valorVenal Double: Atributo valorVenal da classe.
     */
    public Veiculo(final String marca, final String modelo, final Double valorVenal) {
        this.marca = marca;
        this.modelo = modelo;
        this.valorVenal = valorVenal;
    }

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

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, valorVenal);
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }

        Veiculo veiculo;
        if (obj instanceof Veiculo) {
            veiculo = (Veiculo) obj;
        } else {
            return false;
        }

        return veiculo.hashCode() == this.hashCode();
    }
}