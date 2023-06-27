package LeetCode_Problems.Array_Problems;

public class Permutation_Array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0};

        int[] ans = buildArray(nums);

        System.out.print("Original Array: ");
        for (int num: nums) {
            System.out.print(num + " ");
        }

        System.out.print("\nNew Array: ");
        for (int num: ans) {
            System.out.print(num + " ");
        }
    }

    static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
