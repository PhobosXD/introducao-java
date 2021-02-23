package br.com.atlasjr.carro;

/**
 * @author Cazuza
 * @since 2021-02-23
 * @description Classe Carro.
 */
public class Carro {
    private final Integer maxPessoas;
    private Integer pessoas = 0;

    public Carro(final Integer pessoas) {
        maxPessoas = pessoas;
    }

    /**
     * @author Cazuza
     * @since 2021-02-21
     * @description Função: insere pessoas no carro.
     * @param pessoas Integer com número de pessoas a entrarem no carro.
     * @return True caso as pessoas tenham entrado. Falso caso contrário.
     */
    public Boolean pushPessoa(final Integer pessoas) {
        if (this.pessoas + pessoas <= maxPessoas) {
            this.pessoas += pessoas;
            return true;
        } else {
            return false;
        }
    }

    /**
     * @author Cazuza
     * @since 2021-02-21
     * @description Função: retira pessoas do carro.
     * @param pessoas Integer com número de pessoas a serem retiradas do carro.
     * @return True caso as pessoas tenham saído. Falso caso contrário.
     */
    public Boolean popPessoa(final Integer pessoas) {
        if (this.pessoas - pessoas >= 0) {
            this.pessoas -= pessoas;
            return true;
        } else {
            return false;
        }
    }

    public Integer getPessoas() {
        return pessoas;
    }
}
