package sorting;

import utils.ArraysUtils;

public class Ex05 {
    public static void main(String[] args) {
        // selection sort 
        int[] digits = {1,5, 9, 4, 6 ,11};

        for (int i = digits.length - 1;i > 0; i--) {
            int maxIndex = -1;
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {

                if (digits[j] > max) {
                    max = digits[j];
                    maxIndex = j;
                }
            }
                // swap element at maxIdx with i

                if (digits[maxIndex] > digits[i]){
                int tmp = digits[i];
                digits[i] = digits[maxIndex];
                digits[maxIndex] = tmp;

            }
        }
        ArraysUtils.printf(digits);
    }
}
