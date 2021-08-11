package timezone;

import utils.DateUtils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * cach lay thoi gian tai 1 dia diem
 * TimeZone
 * Calendar
 * LocalDate
 */
public class Ex01 {
    public static void main(String[] args) {
        // locale : language - country
        // time- zone :GMT, UTC , Abbreviation(HSK, ICT) Area.

        // system
        TimeZone  tzdef = TimeZone.getDefault();
        System.out.println("tzddef : "+tzdef);

        System.out.println("======================");
        String[] a = TimeZone.getAvailableIDs();
        for (String b : a ) {
            System.out.println(b);
        }

        // Europe/berlin ==  Etc/GMT-2
        TimeZone tzBerlin = TimeZone.getTimeZone("Etc/GMT-2");

        Calendar c = Calendar.getInstance(tzBerlin);
        System.out.println("date time berlin: "+DateUtils.format(c,tzBerlin));
        System.out.println("=========================");

        // Java 8
        LocalDateTime dtBerlin = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println("date time berlin : "+dtBerlin);
    }
}
