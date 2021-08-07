package day1;

import java.util.Scanner;

public class Ex01 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n, x, k;
        System.out.println("Enter n:");
        n = sc.nextInt();

        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            System.out.print(i+": ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t"+arr[i]);
        }
        System.out.println("\nEnter x:");
        x = sc.nextInt();

        System.out.println("Enter k:");
        k = sc.nextInt();

        for (int i = n; i >= k + 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[k] = x;
         n++;

        for (int i = 0; i < n; i++) {
            System.out.print("\t" + arr[i]);
        }


    }
}
