package P2293번_동전_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        int[] coins = new int[n];
        for (int i = 0; i < n; i++)
            coins[i] = Integer.parseInt(br.readLine());
        int[] dp = new int[k + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++)
            for (int j = 1; j <= k; j++)
                if (coins[i] <= j)
                    dp[j] += dp[j - coins[i]];
        System.out.println(dp[k]);
    }
}