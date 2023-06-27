package LeetCode_Problems.Array_Problems;

import java.util.Scanner;

public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        int[][] accounts = new int[rows][columns];

        System.out.print("Enter the values for the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the value for array[" + i + "][" + j + "]: ");
                accounts[i][j] = sc.nextInt();
            }
        }

        System.out.println(solve(accounts));
    }

    static int solve(int[][] accounts) {
        int n = accounts.length;
        int col = accounts[0].length;
        int maxWealth = 0;
        for (int i = 0; i < n; i++) {
            int wealth = 0;
            for (int j = 0; j < col; j++) {
                wealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, wealth);
        }
        return maxWealth;
    }
}
