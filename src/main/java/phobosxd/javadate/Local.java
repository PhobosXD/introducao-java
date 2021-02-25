package phobosxd.javadate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author PhobosXD
 * @since 2021-02-25
 * @version 1.0
 */
public class Local {
    /**
     * @author PhobosXD
     * @since 2021-02-25
     * @param args Argumentos da main.
     */
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate ontem = hoje.minusDays(1);
        System.out.println(ontem);

        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        LocalTime depois = agora.plusHours(1);
        System.out.println(depois);

        LocalDateTime presente = LocalDateTime.now();
        System.out.println(presente);

        LocalDateTime futuro = presente.plusDays(5).plusHours(2);
        System.out.println(futuro);

        LocalDateTime teste = LocalDateTime.of(2010, 05, 15, 10, 00, 00);
        System.out.println(teste);

        futuro = teste.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println(futuro);
    }
}
