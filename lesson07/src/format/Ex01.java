package format;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Ex01 {
    public static void main(String[] args) {
        double digits = 12312435764562389d;
        System.out.println(digits);

//        Locale france = Locale.FRANCE;
        Locale locale = new Locale("da","Dk");

        // NumberFormat
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println("=============================");
        System.out.println("Number instance: "+nf.format(digits));

        System.out.println("=============================");
        // Currency instance : dinh dang tien te .
        NumberFormat nfc = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Currency instance : "+nfc.format(digits));

    }


}
