//package day1;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
///**
// * Rotate an array of n elements  the right by k steps.
// *
// * For example, with n = 7 and k = 3,
// * the array [1,2,3,4,5,6,7] is rotated  [5,6,7,1,2,3,4].
// * How many different ways do you know  solve this problem?
// */
//public class RotateArrayInJava {
//    public static void main(String[] args) {
//        int[]  arr = {1, 2, 3, 4, 6, 7, 8, 11, 44};
//        int k = 4;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("  "+arr[i]);
//        }
//        System.out.println("\n=================");
//        rightRotate(arr,k);
//        System.out.println(Arrays.String(arr));
//    }
//
//    private static void rightRotateByOne (int[] arr ){
////        array length = array's last Index + 1.
//        int last = arr[arr.length - 1];
//        for (int i = arr.length - 2; i >=0  ; i--) {
//            arr[i + 1] = arr[i];
//        }
//        arr[0]= last;
//    }
//
//    private static void rightRotate(int [] arr, int k){
//
//        for (int i = 0; i < k; i++) {
//            rightRotateByOne(arr);
//        }
//    }
//}
