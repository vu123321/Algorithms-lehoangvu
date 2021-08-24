package utils;

public class ArraysUtils {

    public ArraysUtils() {
    }

    public static void printf(int[] digits){
        for (int digit: digits
        ) {
            System.out.print(digit+" ");
        }
        System.out.println();
    }
    public static void printf(Object[] objects){
        for (Object object: objects
        ) {
            System.out.println(object+"  ");
        }
    }
}
