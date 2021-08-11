package timezone;

import java.text.DecimalFormat;

/**
 * tu define
 */
public class Ex02 {

    private static String PATTERN = "#,###.00";

    // # 0 , .
    public static void main(String[] args) {
        double digit = 123578868.2735d;

        DecimalFormat df = new DecimalFormat(PATTERN);

        System.out.println(String.format("df: " + df.format(digit)));
    }
}
