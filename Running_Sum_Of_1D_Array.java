package LeetCode_Problems.Array_Problems;

import java.util.Scanner;

public class Running_Sum_Of_1D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        System.out.print("Enter the elements of the array: ");
        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = runningSum(nums);

        for (int runningSum: result) {
            System.out.print(runningSum + " ");
        }
    }

    static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] Sum = new int[n];
        Sum[0] = nums[0];

        for (int i = 1; i < n; i++) {
            Sum[i] = Sum[i - 1] + nums[i];
        }
        return Sum;
    }
}
