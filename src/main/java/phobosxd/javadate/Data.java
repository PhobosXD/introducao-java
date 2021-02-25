package phobosxd.javadate;

import java.time.Instant;
import java.util.Date;

/**
 * @author PhobosXD
 * @since 2021-02-25
 * @version 1.0
 */
public class Data {
    /**
     * @author PhobosXD
     * @since 2021-02-25
     * @param args Argumentos da main.
     */
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println(data);

        long currentTime = System.currentTimeMillis();

        data = new Date(currentTime);
        System.out.println(data);

        Instant instant = data.toInstant();
        System.out.println(instant);
    }
}
