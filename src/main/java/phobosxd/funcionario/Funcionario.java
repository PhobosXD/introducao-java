package phobosxd.funcionario;

/**
 * @author PhobosXD
 * @since 2021-02-24
 * @version 1.0
 */
public class Funcionario {
    private Double salario;

    public void setSalario(final Double salario) {
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public Double getImposto() {
        return salario * 0.0001;
    }
}