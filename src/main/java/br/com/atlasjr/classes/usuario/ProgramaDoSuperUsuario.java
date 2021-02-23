package br.com.atlasjr.classes.usuario;

/**
 * @author Cazuza
 * @version 1.0
 * @since 2021-02-22
 */
public class ProgramaDoSuperUsuario {
    /**
     * @author Cazuza
     * @version 1.0
     * @since 2021-02-22
     * @param args Argumentos da main.
     */
    public static void main(String[] args) {
        //Variável superUsuario: Guarda um objeto da classe SuperUsuário.
        final var superUsuario = new SuperUsuario("cazuza", "1234");

        superUsuario.getLogin();
        superUsuario.getSenha();
        String root = superUsuario.nome;
    }
}
