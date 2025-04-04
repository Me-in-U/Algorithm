package P1149번_RGB거리;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        // cost[i][j]: i번째 집의 j색깔 비용 (0: R, 1: G, 2: B)
        int[][] cost = new int[N][3];
        for (int i = 0; i < N; i++) {
            cost[i][0] = readInt();
            cost[i][1] = readInt();
            cost[i][2] = readInt();
        }
        // dp[i][j]: i번째 집까지 j색으로 칠했을 때 최소 비용
        int[][] dp = new int[N][3];
        // 초기값
        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];
        // dp 배열 채우기
        // dp[i] 빨강 비용 = i번째 빨강 비용 + (dp[i-1]번째 나머지 색 비용 최솟값)...
        for (int i = 1; i < N; i++) {
            dp[i][0] = cost[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = cost[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = cost[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }
        int answer = Math.min(dp[N - 1][0], Math.min(dp[N - 1][1], dp[N - 1][2]));
        System.out.print(answer);
    }

    private static int readInt() throws IOException {
        int c, n = 0;
        c = System.in.read();
        while (c <= ' ') {
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
