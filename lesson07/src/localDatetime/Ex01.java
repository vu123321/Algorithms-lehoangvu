package localDatetime;


import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/*
 Demo Java 08
 */
public class Ex01 {
    private static String PATTERN = "dd/MM/yyyy";
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();//  tra ve thoi gian hien tai,
        LocalDate anotherDate = LocalDate.of(2021, Month.AUGUST,6);
        LocalDate d1 = LocalDate.of(2021,Month.AUGUST,10);

        System.out.println("date " +date);
        System.out.println("anotherDate: "+anotherDate);

        // format - parse
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PATTERN);
        System.out.println("format: "+dtf.format(date));
        System.out.println("format: "+dtf.format(anotherDate));
        System.out.println("format: "+dtf.format(d1));

        // -- pare

        // :: before - child
//        TemporalAccessor  ta = dtf.parse("12/12/2020");
//        System.out.println("ta "+ta);

        // :: after = parent

        LocalDate a = LocalDate.parse("2020-02-15");
        System.out.println(a);

        // theo kieu pattern
        LocalDate b = LocalDate.parse("06/08/1999",dtf);
        System.out.println(b);

        CharSequence s = String.join(",","a","b");
        System.out.println(s);

        // duration
        // de tim 1 khoang thoi gian giua 2 LocalDate trong Java 08 co ho tro 1  class la
        // Period.between()

        Period period = Period.between(date,anotherDate);
        System.out.println("period: "+period);// no se goi ham to string().
        // ro rang hon
        System.out.println(period.getYears()     +" year \n"
                            + period.getMonths() +" month \n"
                            + period.getDays()   +" day");
    }
}
