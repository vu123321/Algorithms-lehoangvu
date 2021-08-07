package hw01;

import utils.DateUtils;

import java.util.Calendar;
import java.util.Date;

public class Ex01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH,Calendar.AUGUST);
        c.set(Calendar.YEAR,2021);

        System.out.println("=============================");
        System.out.println("Year ActualMaxDays "+c.getActualMaximum(Calendar.DAY_OF_YEAR));
        System.out.println("ActualMaxDays:"+c.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println("MaxDays:"+c.getMaximum(Calendar.DAY_OF_MONTH));
        System.out.println("=============================");

        c.add(Calendar.DAY_OF_MONTH , c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c);
        // print out week
        System.out.println("=============================");
        printWeekdays(c);
        System.out.println("-----------------------------");
        printDaysInMoth(c);
        System.out.println("=============================");
        Date date = DateUtils.to("04/Wed/2021  06:18:32 PM Wednesday");
        System.out.println("date :"+date);
        System.out.println("==============================");



    }
    private static void printWeekdays(Calendar c){

        int day = 1;
        while(day <=  7 ){
            System.out.println(DateUtils.format(c)); //   dd//MM//yyyy
            c.add(Calendar.DAY_OF_WEEK,1);
            day++;
        }
    }

    private static void printDaysInMoth(Calendar c){

        int daysInMoth = c.getActualMaximum(Calendar.DAY_OF_MONTH);

        int day = 1;
        while(day <=  daysInMoth ){
            System.out.println(DateUtils.format(c));
            c.add(Calendar.DAY_OF_WEEK,1);
            day++;
        }
    }
}
