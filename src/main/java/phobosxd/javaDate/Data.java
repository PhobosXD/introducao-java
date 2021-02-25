package phobosxd.javaDate;

import java.time.Instant;
import java.util.Date;

public class Data {
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
