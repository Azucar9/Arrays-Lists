package LeetCode_Problems.Array_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Concatenation_Of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        //Giving inputs to array using a for-loop
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int[] concatenatedArray = getConcatenation(nums);

//        Printing the output here
        for (int concatenated: concatenatedArray) {
            System.out.print(concatenated + " ");
        }

        //If you want to print out an array in a sophisticated manner this is how you do it.
//        System.out.println(Arrays.toString(concatenatedArray));
    }

    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
