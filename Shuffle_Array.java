package LeetCode_Problems.Array_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Shuffle_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the divider for the array: ");
        int n = sc.nextInt();

        System.out.println(Arrays.toString(solve(arr, n)));
    }

    static int[] solve(int[] arr, int n) {
        int[] nums = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i+=2) {
            nums[i] = arr[j];
            nums[i + 1] = arr[n + j];
            j++;
        }
        return nums;
    }
}
