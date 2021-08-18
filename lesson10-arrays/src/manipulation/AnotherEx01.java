package manipulation;

import utils.ArraysUtils;

import java.util.Arrays;

public class AnotherEx01 {
    public static void main(String[] args) {
        int[] digits = {4, 5, 6, 7, 8, 89};

        ArraysUtils.printf(digits);
        ArraysUtils.printf(add(digits, 2, 77));
        ArraysUtils.printf(insert(digits,3, 55));
        ArraysUtils.printf(remove(digits,3));
        ArraysUtils.printf(delete(digits,0));
        System.out.println("=========================");
        digits[4] = 6;
       ArraysUtils.printf(digits);
    }


    //  1,2,3,4,5,6,7,8,89
    // k = 2, newElement = 77
    // 1,2, "77" ,3,4,5,6,7,8,89
    private static int[] add(int[] digits,
                             int k,
                             int newElement) {
        int[] result = new int[digits.length + 1];

        for (int i = 0; i < k; i++) {
            result[i] = digits[i];
        }
        result[k] = newElement;

        for (int i = k + 1; i < result.length; i++) {
            result[i] = digits[i - 1];
        }
        return result;
    }

    // 0 0 0 0  0  0
    // 1 9 5 36 12 33  0
    // 1 9 5 5  36 12 33

    private static int[] insert(int[] digits, int k , int newElement){
        int[] result = new int[digits.length + 1];

        // copy
        for (int i = 0; i < digits.length; i++) {
            result[i] = digits[i];
        }

        // shift right 1 unit
        for (int i = result.length - 1;  i > k ; i--) {
            result[i] = result[i - 1];
        }

        result[k] = newElement;

        return result;
    }

    private static int[] remove(int[] digits, int k){
        int[] result = new int[digits.length - 1];

        for (int i = 0; i < k ; i++) {
            result[i] = digits[i];
        }

        for (int i = k + 1; i < digits.length; i++) {
            result[i - 1 ] = digits[i];
        }
        return result;
    }


    // 1 9 5 36 12 33
    // k = 3

    // 1 9 5 12 33 33
    private static int[] delete(int[ ] digits, int k){
        for (int i = k + 1; i < digits.length  ; i++) {
            digits[i-1] = digits[i];
        }

        return Arrays.copyOfRange(digits,0,digits.length - 1);
    }
}
