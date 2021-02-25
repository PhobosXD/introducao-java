package phobosxd.javaDate;

import java.util.Calendar;

public class Calendario {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        //System.out.println(agora.getTime());

        agora.add(Calendar.DATE, -20);
        //System.out.println(agora.getTime());

        agora.add(Calendar.MONTH, 3);
        //System.out.println(agora.getTime());

        agora.add(Calendar.YEAR, 1);
        //System.out.println(agora.getTime());

        System.out.printf("%tc\n", agora);
        System.out.printf("%tF\n", agora);
        System.out.printf("%tD\n", agora);
        System.out.printf("%tr\n", agora);
        System.out.printf("%tT\n", agora);
    }
}
