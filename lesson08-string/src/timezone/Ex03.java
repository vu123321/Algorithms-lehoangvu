package timezone;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex03 {
    public static void main(String[] args) {
        BigDecimal    number = BigDecimal.valueOf(85741.654788d);
        System.out.println("h1      :"+System.identityHashCode(number));
        System.out.println("number  :"+number);

        // Rounding

        number = number.setScale(2,RoundingMode.HALF_UP);

        System.out.println("h2:"+System.identityHashCode(number));
        System.out.println("rounding: "+number);

//        System.out.println("h2: "+System.identityHashCode(a));
//        System.out.println("number:"+a);
    }
}
