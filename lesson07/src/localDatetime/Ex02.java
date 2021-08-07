package localDatetime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex02 {
    // LocalTime
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalTime anotherTime = LocalTime.of(23,30,30);

        System.out.println("time: "+time);
        System.out.println("another: "+anotherTime);
        Duration duration = Duration.between(time , anotherTime);
        System.out.println("duration: "+duration);


        System.out.println(duration.toHoursPart()       +" Hour \n"
                + duration.toMillisPart()               +" Minutes \n"
                + duration.toSecondsPart()              +" Seconds");

    }
}
