package br.com.atlasjr.carro;

/**
 * @author Cazuza
 * @since 2021-02-23
 */
public class Programa {
    /**
     * @author Cazuza
     * @since 2021-02-23
     * @param args Argumentos da main.
     */
    public static void main(String[] args) {
        var carro = new Carro(5);

        System.out.println(carro.getPessoas());

        if (carro.pushPessoa(6)) {
            System.out.println("Pessoas entraram no carro!");
        } else {
            System.out.println("As pessoas nao conseguiram entrar!");
        }

        carro.pushPessoa(3);

        System.out.println(carro.getPessoas());

        if (carro.popPessoa(2)) {
            System.out.println("As pessoas sairam do carro!");
        } else {
            System.out.println("As pessoas nao conseguiram sair do carro!");
        }

        System.out.println(carro.getPessoas());
    }
}
