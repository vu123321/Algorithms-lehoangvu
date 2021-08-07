package localDatetime;

import java.time.*;

public class Ex03 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime anotherDateTime = LocalDateTime.of(2022, 8, 30, 6, 58, 58);

        System.out.println("dateTime : " + dateTime);
        System.out.println("anotherTime : " + anotherDateTime);

        LocalDate dateStart = dateTime.toLocalDate();
        System.out.println(dateStart.atTime(12, 22));

        System.out.println("===========================");

        // tim khoang thoi gian hai nguoi quen nhau .

        // voi LocalDateTime , Period , Duration .

        if (dateTime.isAfter(anotherDateTime)){
            System.out.println("start time cannot exceed end time!!");
            return;
//            throw new IllegalArgumentException("start time cannot exceed end time !!");
        }


        LocalDate dateStartOne = dateTime.toLocalDate();
        LocalTime timeStart = dateTime.toLocalTime();

        LocalDate dateEnd = anotherDateTime.toLocalDate();
        LocalTime timeEnd= anotherDateTime.toLocalTime();

        Period period = Period.between(dateStartOne, dateEnd);


        Duration duration = Duration.between(timeStart, timeEnd);

        if (timeStart.isAfter(timeEnd)){
            duration = duration.plusDays(1);
            period = period.minusDays(1);
//            P1Y24D ----- PT14H25M25.788838105S
        }
        System.out.println(period+" ----- "+duration);



    }
}
