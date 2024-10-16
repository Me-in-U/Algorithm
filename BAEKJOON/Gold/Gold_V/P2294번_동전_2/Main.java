package P2294번_동전_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        int max = Integer.MAX_VALUE - 1;
        int[] coins = new int[n];
        for (int i = 0; i < n; i++)
            coins[i] = Integer.parseInt(br.readLine());
        Arrays.sort(coins);
        int[] dp = new int[k + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 0; i < n; i++)
            for (int j = coins[i]; j <= k; j++)
                dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
        System.out.println(dp[k] == max ? -1 : dp[k]);
    }
}