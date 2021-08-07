package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class DateUtils {
    private static final String PATTERN = "dd/MMM/yyyy  KK:mm:ss a EEEE";
    private static final GregorianCalendar gc = new GregorianCalendar();
    private DateUtils(){

    }

    public static Calendar getDateTime(int year, int month ,  int day,int hour,int minute,int second){
        Calendar c = Calendar.getInstance();
        c.set(year,month,day,hour,minute,second);
        return c;
    }

    public static Calendar getDate(int year, int month ,  int day){
        Calendar c = Calendar.getInstance();
        c.set(year,month,day);
        return c;
    }
    public static boolean isLeapYear(int year){
        return gc.isLeapYear(year);
    }

    /**
     * Convert calendar  format string with required ( dd/EE/yyyy  KK:mm:ss a EEEE ) pattern.
     *
     * @param c  given calendar
     * @return formated calendar as string
     */
    public static String format(Calendar c){
//        if(c == null){
//            throw new NullPointerException();
//        }
        Objects.requireNonNull(c);

        // pattern : dd/MM/yyyy
        DateFormat df = new SimpleDateFormat(PATTERN);
        return df.format(c.getTime());
    }

    /**
     * Covert String   to  Date with required pattern .
     * @param s given String
     * @return Date type
     */
    public static Date to(String s){
        Objects.requireNonNull(s);
        DateFormat df = new SimpleDateFormat(PATTERN);
        Date date = null;
        try {
            date =  df.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    /**
     * Covert date   to  calendar .
     * @param date given Date
     * @return Calendar  type
     */
    public static Calendar to(Date date){
        Objects.requireNonNull(date);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c;
    }
}
