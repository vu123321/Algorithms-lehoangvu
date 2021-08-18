package demo;

import utils.ArrayUtils;
import utils.ArraysUtils;

import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        // source " List<E> ,E[]
        int[] digits = {1,2,1,3,4,2,5,6,6,8,8,99};


       int[] evenNumbers = Arrays.stream(digits).filter(d -> d % 2 == 0).toArray();


       ArraysUtils.printf(digits);
//        List<Integer> numbers = Arrays.asList(1,2,1,3,4,2,5,6,6,8,8,99);
//
//        List<Integer> evenNumbers = numbers.stream().filter(nbr  -> nbr % 2 == 0)
//                                                    .distinct() // set , map , HashTable >> hashcode , equals
//                                                    .collect(Collectors.toList());
//        CollectionUtils.printf(evenNumbers);
//
//        System.out.println("============================");
//        Set<Integer> evenNumbers1 = numbers.stream().filter(nbr  -> nbr % 2 == 0)
//
//                .collect(Collectors.toSet());
//        System.out.println("runtime :" +evenNumbers1.getClass().getSimpleName());
//        CollectionUtils.printf(evenNumbers1);



    }
}
