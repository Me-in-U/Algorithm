package P1912번_연속합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] dp = new int[n];
        int max = dp[0] = numbers[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + numbers[i], numbers[i]);
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}