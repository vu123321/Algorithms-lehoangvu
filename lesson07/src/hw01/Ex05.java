package hw01;

import utils.DateUtils;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex05 {
    public static void main(String[] args) {

        Calendar start = DateUtils.getDateTime(2021, Calendar.JUNE, 22, 20, 18, 12);
        Calendar now = Calendar.getInstance();

        if (start.after(now)) {
            throw new IllegalArgumentException("start time cannot exceed curred time !");
        }

        // epoch time  = unix time = 1.1.1970
//        long startAsMilliseconds = start.getTimeInMillis();
        long startAsMilliseconds = start.getTimeInMillis();
        long nowAsMilliseconds = now.getTimeInMillis();

        long duration = nowAsMilliseconds - startAsMilliseconds;


        // 768mm = 7 dm + 6 cm + 8 cm
        // ms = day + hour + minute + seconds  millis
        // x = 2780mm += 2m + 7 dm + 8 cm
        // x/1000 = 2 m
        // 2780 - 2*1000 = 780mm
        // 780/100 = 7 dm
        // 768 - 7*100 = 80 cm
//        long days = duration / (24 * 60 * 60 * 1000);
//        duration = duration - days*(24 * 60 * 60 * 1000);
//
//        long hour = duration / (60 * 60 *1000);
//        trong java thi co san ham.

        long days = TimeUnit.MILLISECONDS.toDays(duration);
        duration = duration - TimeUnit.DAYS.toMillis(days);

        long hour = TimeUnit.MILLISECONDS.toHours(duration);
        duration = duration -TimeUnit.HOURS.toMillis(hour);


        long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
        duration = duration -TimeUnit.MINUTES.toMillis(minutes);

        long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
        duration = duration -TimeUnit.SECONDS.toMillis(seconds);

        System.out.println("duration: "+days + "D "+hour+ "H "+minutes+"M "+seconds+"S");
    }
}
