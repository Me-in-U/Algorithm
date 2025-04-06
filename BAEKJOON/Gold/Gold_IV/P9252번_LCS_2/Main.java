package BAEKJOON.Gold.Gold_IV.P9252번_LCS_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        dp = new int[str1.length() + 1][str2.length() + 1];
        dpLCS(str1, str2);
        String lcs = buildLCS(str1, str2);
        printLCS(lcs);
    }

    private static void dpLCS(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i][j], Math.max(dp[i + 1][j], dp[i][j + 1]));
                }
            }
        }
    }

    private static String buildLCS(String str1, String str2) {
        StringBuilder lcs = new StringBuilder();
        int x = str1.length();
        int y = str2.length();
        while (x > 0 && y > 0) {
            if (str1.charAt(x - 1) == str2.charAt(y - 1)) {
                lcs.append(str1.charAt(x - 1));
                x--;
                y--;
            } else if (dp[x - 1][y] >= dp[x][y - 1]) {
                x--;
            } else {
                y--;
            }
        }
        return lcs.reverse().toString();
    }

    private static void printLCS(String lcs) {
        System.out.println(lcs.length());
        if (lcs.length() > 0)
            System.out.println(lcs);
    }
}
