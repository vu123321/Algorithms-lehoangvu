package manipulation;

import utils.ArraysUtils;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        int[] digits = {4,5,6,7,8,89};

        ArraysUtils.printf(add(digits,2,77));
    }


    //  1,2,3,4,5,6,7,8,89
    // k = 2, newElement = 77
    // 1,2, "77" ,3,4,5,6,7,8,89
    private static int[] add(int[] digits, int k, int newElement){
        int[] result = new int[digits.length + 1];

        for (int i = 0; i < k; i++) {
            result[i] = digits[i];
        }
        result[k] = newElement;

        for (int i = k + 1; i < result.length ; i++) {
            result[i] = digits[i - 1];
        }
        return result;
    }
}
