package manipulation;

import utils.ArraysUtils;

public class Ex02 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {1,2,3,4,5,6,7,8,9};

        reverse(a);
        ArraysUtils.printf(a);
        reverse(b);
        ArraysUtils.printf(b);

    }
    private static void reverse(int[] digits){


//        System.out.println(digits.length);
        for (int i = 0; i < digits.length / 2; i++) {

            int tmp = digits[i];
            digits[i] = digits[digits.length - i - 1];
            digits[digits.length  - i -1 ] = tmp;
        }
    }
}
