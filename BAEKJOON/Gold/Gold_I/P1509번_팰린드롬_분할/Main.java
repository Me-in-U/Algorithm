package BAEKJOON.Gold.Gold_I.P1509번_팰린드롬_분할;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int length = str.length();
        boolean[][] palindrome = new boolean[length + 1][length + 1];
        int[] dp = new int[length + 1];
        for (int i = 1; i <= length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i <= length; i++) {
            for (int j = i; j <= length; j++) {
                boolean isPalindrome = true;
                int left = i - 1;
                int right = j - 1;
                while (left <= right) {
                    if (str.charAt(left++) != str.charAt(right--)) {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome) {
                    palindrome[i][j] = true;
                }
            }
        }
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                if (palindrome[j][i]) {
                    dp[i] = Math.min(dp[i], dp[j - 1] + 1);
                }
            }
        }
        System.out.println(dp[length]);
    }
}