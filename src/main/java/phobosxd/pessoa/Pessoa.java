package phobosxd.pessoa;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author PhobosXD
 * @since 2021-02-23
 * @version 1.0
 */
public class Pessoa {
    private String nome;
    private final LocalDate dataNascimento;

    public Pessoa(final String nome, final Integer ano, final Integer mes, final Integer dia) {
        this.nome = nome;
        this.dataNascimento = LocalDate.of(ano, mes, dia);
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
}
