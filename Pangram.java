package LeetCode_Problems.Array_Problems;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();

        System.out.println(checkIfPangram(sentence));

    }

    static boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        boolean[] alphabets = new boolean[26];
        for (int i = 0; i < n; i++) {
            char c = sentence.charAt(i);

            if (c >= 'a' && c <= 'z') {
                alphabets[c - 'a'] = true;
            }
        }

        for (boolean alphabet: alphabets) {
            if (!alphabet) {
                return false;
            }
        }
        return true;
    }
}
