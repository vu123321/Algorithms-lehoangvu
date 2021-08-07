package hw01;

import java.util.Calendar;

public class Ex03 {
    // làm bài tìm trong 1 tháng các thứ có tối đa bao nhiêu ngày .
    // ví dụ tháng 4 ,2019 , các thứ có ngày nhiều nhất là . các thứ có ngày ít nhất là .

    public static void main(String[] args) {
        int month = Calendar.OCTOBER;
        int year = 2022;


        Calendar c = Calendar.getInstance();
        c.set(year, month, 1);

        int dayInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        int firstWeekDaysOfMonth = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("firstWeekDaysOfMonth: " + firstWeekDaysOfMonth);
        System.out.println("dayInMonth          : " + dayInMonth);

        int weekdays = Calendar.TUESDAY;

        int fiveDays[] = null;


        // 31 : 3 thứ xuất hiện 5 lần ( 3 - 2)
        // 30 : 2 thứ
        // 29 : 1 thứ
        // 28 : 0 thứ

        switch (dayInMonth) {
            case 31: // 5 6 7
//                result =  Math.abs(firstWeekDaysOfMonth - weekdays) < 3 ? 5 : 4;
                fiveDays = new int[3];
                fiveDays[0] = c.get(Calendar.DAY_OF_WEEK);
                c.add(Calendar.DAY_OF_MONTH, 1);
                fiveDays[1] = c.get(Calendar.DAY_OF_WEEK);
                c.add(Calendar.DAY_OF_MONTH, 1);
                fiveDays[2] = c.get(Calendar.DAY_OF_WEEK);
                break;
            case 30: // 5 6
                fiveDays = new int[2];
                fiveDays[0] = c.get(Calendar.DAY_OF_WEEK);
                c.add(Calendar.DAY_OF_MONTH, 1);
                fiveDays[1] = c.get(Calendar.DAY_OF_WEEK);
                break;
            case 29: // 5
                fiveDays = new int[1];
                fiveDays[0] = c.get(Calendar.DAY_OF_WEEK);
                break;
        }
        System.out.println("test:  "+nOfWeekdays(weekdays,fiveDays));
    }
    private static int nOfWeekdays(int weekdays,int fiveDays[]){
        for (int day : fiveDays)
        {
            System.out.println("fiveDays: "+day);
            if (weekdays == day){
                return 5;
            }
        }
        return 4;
    }
}

