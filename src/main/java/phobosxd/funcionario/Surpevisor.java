package phobosxd.funcionario;

/**
 * @author PhobosXD
 * @since 2021-02-24
 * @version 1.0
 */
public class Surpevisor extends Funcionario {
    public Surpevisor(final Double salario) {
        this.setSalario(salario);
    }

    @Override
    public Double getImposto() {
        return getSalario() * 0.0005;
    }
}
