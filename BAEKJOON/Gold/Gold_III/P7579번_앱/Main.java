package P7579번_앱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int costSum = 0;
        int minCost = Integer.MAX_VALUE;

        st = new StringTokenizer(br.readLine());
        int[] appMemories = new int[N + 1];
        for (int i = 1; i <= N; i++)
            appMemories[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] cost = new int[N + 1];
        for (int i = 1; i <= N; i++)
            costSum += (cost[i] = Integer.parseInt(st.nextToken()));

        int[][] dp = new int[N + 1][costSum + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= costSum; j++) {
                if (j - cost[i] >= 0) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - cost[i]] + appMemories[i]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
                if (dp[i][j] >= M) {
                    minCost = Math.min(minCost, j);
                }
            }
        }
        System.out.println(minCost);
    }
}