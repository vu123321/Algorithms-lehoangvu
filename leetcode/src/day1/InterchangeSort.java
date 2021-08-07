package day1;

import java.util.Scanner;


public class InterchangeSort {


    /**
     * Rotate an array of n elements  the right by k steps.
     * <p>
     * For example, with n = 7 and k = 3,
     * the array [1,2,3,4,5,6,7] is rotated  [5,6,7,1,2,3,4].
     * How many different ways do you know  solve this problem?
     */

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n, tmp;


        int[] arr = {1, 5, 7, 8, 999, 666, 444, 0};
        System.out.println("\narray:");
        for (int i = 0; i < arr.length; i++) {

            System.out.print("   " + arr[i]);
        }
        System.out.println("\n=========================");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("\narray is: ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print("   " + arr[i]);
        }
        System.out.println("\n=================");
//            // khi i > n - 1 thì ngừng vòng lặp
//            for (int i = 0; i < arr.length - 1; i++) {
//                for (int j = arr.length - 1; j >= 1; j--) {
//                    // nếu phần tử đứng sau nhỏ hơn phần tử đứng trước
//                    // thì đổi chỗ 2 phần tử đó cho nhau
//                    // với cách sắp xếp này thì trong lần duyệt đầu tiên
//                    // phần tử nhỏ nhất sẽ được chuyển lên trên cùng.
//                    if (arr[j] > arr[j - 1]) {
//                        tmp = arr[j];
//                        arr[j] = arr[j - 1];
//                        arr[j - 1] = tmp;
//                    }
//                }
//            }

        SortArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }

    private  static void SortArr(int[] arr){
        int tmp;
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
