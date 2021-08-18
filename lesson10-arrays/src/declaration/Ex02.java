package declaration;

import java.util.Arrays;
import java.util.function.Predicate;

public class Ex02 {
    public static void main(String[] args) {
        int[] digits = {0,100,2,3,4,5,6,7,22,0};
        printf(getElements(digits));
    }

    private static int[] getElements(int[] digits ){

        int[] result = new int[digits.length];

        int index = 0;
        for (int digit: digits
             ) {
            if (digit % 2 == 0){

                result[index++] = digit;
            }
        }
//        return Arrays.copyOf(result,index); 1 cach de loai bo gia tri mac dinh (0). Day la dung ham.
        int[] a = new int[index];
        for (int i = 0; i < index;i++){
            a[i] = result[i];
        }
        return a;
    }
    private static void printf(int[] digits){
        for (int digit: digits
             ) {
            System.out.print(digit+" ");
        }
        System.out.println();
    }
}
