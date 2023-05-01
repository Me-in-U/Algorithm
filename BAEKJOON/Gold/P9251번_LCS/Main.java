package P9251번_LCS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  private static char[] first_str;
  private static char[] second_str;
  private static int[][] dp;
  private static int str1_length, str2_length;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    first_str = br.readLine().toCharArray();
    second_str = br.readLine().toCharArray();

    str1_length = first_str.length;
    str2_length = second_str.length;

    dp = new int[str1_length + 1][str2_length + 1];

    solve();

    System.out.println(dp[str1_length][str2_length]);
  }

  public static void solve() {
    for (int i = 1; i <= str1_length; i++) {
      for (int j = 1; j <= str2_length; j++) {
        if (first_str[i - 1] == second_str[j - 1]) {
          dp[i][j] = dp[i - 1][j - 1] + 1;
        } else {
          dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        }
      }
    }
  }
}