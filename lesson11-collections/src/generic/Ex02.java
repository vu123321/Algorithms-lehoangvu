package generic;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Ex02 {
    public static void main(String[] args) {
        List<Integer> intList   = Arrays.asList(1, 2, 3, 4, 5);
        List<Float> floatList   = Arrays.asList(1f, 2f, 3f, 4f, 5f);
        List<Double> doubleList = Arrays.asList(1d, 2d, 3d, 4d, 5d);
        List<Number> numberList = Arrays.asList(1,1d,1f);


        List<String> stringList = Arrays.asList("a", "b", "c", "d", "e");
        List<CharSequence> charsList = Arrays.asList("x","y");



        printf(intList);
        printf(numberList);
//        printf(doubleList);
//        printf(floatList);
//
//        printf(stringList);
//        printf(charsList);


    }

    // E: generics type
    // ?: wildcard

    private static <E extends CharSequence> void printf(List<? super Integer> elements){
        for (Object element : elements) {
            System.out.println(element+" " );
        }
        System.out.println();
    }
}
