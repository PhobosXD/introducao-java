package br.com.atlasjr.classes.usuario;

/**
 * @author Cazuza
 * @version 1.0
 * @since 2021-02-22
 */
public class SuperUsuario {
    private String login;
    private String senha;
    String nome;

    /* Construtor da classe SuperUsuario SuperUsuario(final String login,final String senha).
     * Recebe como parâmetro o login e a senha no formato string.*/
    public SuperUsuario(final String login, final String senha) {
        this.login = login;
        this.senha = senha;
    }

    /* Método getLogin() da classe SuperUsuario.
     * Retorna o login da classe.*/
    protected String getLogin() {
        return login;
    }

    /* Método getSenha() da classe SuperUsuario.
     * Retorna a senha da classe.*/
    public String getSenha() {
        return senha;
    }
}
