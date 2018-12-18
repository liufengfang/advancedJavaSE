package java8.date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by liufengfang on 2018/12/18.
 */
public class T1 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        Date d = Date.from(instant);
        String df = DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(ZonedDateTime.of
                (1991,7,16,10,32,0,
                        0, ZoneId.of("America/New_York")));
        System.out.println(df);
        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String ss = dtf.format(ZonedDateTime.ofInstant(instant, ZoneId.of("America/New_York")));
        System.out.println(ss);
    }
}
