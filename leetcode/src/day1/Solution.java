package day1;

public class Solution {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 20, 4, 1, 0 };
        int n = arr.length;

        System.out.print("Index of a peak point is " +
                Solution.findPeakElement(arr, n));

    }
    private static int findPeakElement(int[] nums, int n) {
        if(n == 1) return 0;
        if(nums[0] >= nums[1]) return 0;
        if(nums[n -1 ] >= nums[n -2]) return n -1;

        for(int i = 1; i < nums.length - 1; i++){
            if( nums[i] >=  nums[i -1] &&
                    nums[i] >=  nums[i + 1]){
                return i;
            }
        }
        return 0;
    }
}
