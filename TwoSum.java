
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.


package LeetCode_Problems.Array_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {2, 7, 11 ,15};

        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.print(Arrays.toString(result));
    }

    static int[] twoSum(int[] nums, int target) {
        //Now how to check the sum of which indices of nums array gives the output of 9(target).
        //We can use two for-loops to iterate over the array and determine the right indices.
        //The reason we are using 2 for loops, is because we need 2 indices to be the sum of the target(9).
        for (int i = 0; i < nums.length; i++) {  //i = 0 because array always starts with the index 0.
            for (int j = i; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    int[] a = {i, j};
                    return a;
                }
            }
        }
        return null;
    }
}
