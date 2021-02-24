package phobosxd;

import phobosxd.pessoa.Pessoa;
import phobosxd.veiculo.Carro;
import phobosxd.veiculo.Motocicleta;

/**
 * @author PhobosXD
 * @since 2021-02-23
 */
public class Main {
    /**
     * @author PhobosXD
     * @since 2021-02-23
     * @param args Argumentos da main.
     */
    public static void main(String[] args) {
        Pessoa eu = new Pessoa("Cazuza", 2000, 04, 24);

        System.out.println(eu.getNome());
        System.out.println(eu.getDataNascimento());
        System.out.println(eu.getIdade());

        eu.setNome("Igor");

        System.out.println(eu.getNome());
    }
}
