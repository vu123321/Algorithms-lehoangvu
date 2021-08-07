package hw01;

import utils.DateUtils;

import java.util.Calendar;

public class Ex02 {
    public static void main(String[] args) {

     countOfSundays(Calendar.JULY,2021);

    }
    // month : 3 va year 2018
    private static int countOfSundays(int month, int year){
        // first day of month
        Calendar start = Calendar.getInstance();// 24.06.2021
        start.set(year,month,1);//1.03.2021


        Calendar end = Calendar.getInstance();// 24.06.2021
        end.set(year,month,start.getActualMaximum(Calendar.DAY_OF_MONTH));

        System.out.println("start : "+DateUtils.format(start));
        System.out.println("end :"+DateUtils.format(end));
        System.out.println("--------------------------------------");
//        int day = 1;
        int count = 0;
//        int dayInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
//
//        while(day <= dayInMonth){
//            System.out.println("date :"+ DateUtils.format(c));
//            if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
//                count++;
//            }
//            c.add(Calendar.DAY_OF_MONTH,1);
//            day++;
//        }

        // duyệt từ start đến end (YC: đếm số ngày Chủ nhật của tháng đó)

        // before la < 0.
        // after  la > 0.
        for(Calendar date = start; !date.after(end);date.add(Calendar.DAY_OF_WEEK,1)){
            if (date.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
                System.out.println("date:"+DateUtils.format(date));
                count++;
            }

//            if (date.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY){
//                System.out.println("date"+DateUtils.format(date));
//                count++;
//                System.out.println("Sunday: "+count);
//            }
//            System.out.println("sunday: "+count);
        }
        System.out.println(""+count);
        return count;
    }
}
