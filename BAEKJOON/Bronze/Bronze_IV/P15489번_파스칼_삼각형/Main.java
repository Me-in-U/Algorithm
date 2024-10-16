package P15489번_파스칼_삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int R = Integer.parseInt(input[0]);
        int C = Integer.parseInt(input[1]);
        int W = Integer.parseInt(input[2]);

        int[][] dp = new int[31][31];
        for (int i = 1; i < 31; i++) {
            dp[i][1] = 1;
            for (int j = 2; j <= i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        int result = 0;
        for (int i = 0; i < W; i++) {
            for (int j = 0; j <= i; j++) {
                result += dp[R + i][C + j];
            }
        }
        System.out.println(result);
    }
}