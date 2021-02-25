package phobosxd.javadate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author PhobosXD
 * @since 2021-02-25
 * @version 1.0
 */
public class Format {
    /**
     * @author PhobosXD
     * @since 2021-02-25
     * @param args Argumentos da main.
     */
    public static void main(String[] args) {
        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);
        System.out.println(agora);

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.SHORT,
                DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:mmm");
        dateToStr = formatter.format(agora);
        System.out.println(dateToStr);
    }
}
