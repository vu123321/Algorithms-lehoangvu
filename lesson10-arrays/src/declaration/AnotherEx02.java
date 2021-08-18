package declaration;

import bean.Condition;

import java.util.Arrays;

public class AnotherEx02 {
    public static void main(String[] args) {
        int[] digits = {0,100,2,3,4,5,6,7,22,0};

        // Strategy pattern
        printf(getElements(digits , d1 ->  d1 % 2 == 0));
        printf(getElements(digits , d1 ->  d1 % 3 == 0));

        // Dài Dòng
//        printf(getElements(digits, new Condition() {
//            @Override
//            public boolean test(int digit) {
//                return digit % 2 == 0;
//            }
//        }));
    }

    private static int[] getElements(int[] digits, Condition cdt ){

        int[] result = new int[digits.length];

        int index = 0;
        for (int digit: digits
        ) {
            if (cdt.test(digit)){
                result[index++] = digit;
            }
        }
//        return Arrays.copyOf(result,index); 1 cach de loai bo gia tri mac dinh (0). Day la dung ham.

//        int[] a = new int[index]; // code pho thong
//        for (int i = 0; i < index;i++){
//            a[i] = result[i];
//        }
        return Arrays.copyOfRange(result,0,index);
    }
    private static void printf(int[] digits){
        for (int digit: digits
        ) {
            System.out.print(digit+" ");
        }
        System.out.println();
    }
}
