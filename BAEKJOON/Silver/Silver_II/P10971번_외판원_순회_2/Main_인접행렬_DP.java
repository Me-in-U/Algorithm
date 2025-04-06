package BAEKJOON.Silver.Silver_II.P10971번_외판원_순회_2;

import java.io.IOException;
import java.util.Arrays;

public class Main_인접행렬_DP {
    static int N;
    static int[][] cost;
    static final int INF = 1000000000;

    public static void main(String[] args) throws IOException {
        N = readInt();
        cost = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                cost[i][j] = readInt();
            }
        }

        int globalMin = INF;
        int size = 1 << N;

        // 모든 노드가 시작점이 될 수 있도록
        for (int start = 0; start < N; start++) {
            // dp[mask][i] : 시작점 'start'에서 시작하여 mask에 포함된 노드를 방문한 후 현재 i번에 있을 때의 최소 비용
            int[][] dp = new int[size][N];
            for (int i = 0; i < size; i++) {
                Arrays.fill(dp[i], INF);
            }
            dp[1 << start][start] = 0;

            // 모든 방문 집합에 대해 상태 전이
            for (int mask = 0; mask < size; mask++) {
                for (int i = 0; i < N; i++) {
                    if ((mask & (1 << i)) != 0 && dp[mask][i] != INF) {
                        // i에서 갈 수 있는 모든 정점 j에 대해
                        for (int j = 0; j < N; j++) {
                            // 아직 j를 방문하지 않았고, i->j 간선이 존재할 때
                            if ((mask & (1 << j)) == 0 && cost[i][j] != 0) {
                                int nextMask = mask | (1 << j);
                                dp[nextMask][j] = Math.min(dp[nextMask][j], dp[mask][i] + cost[i][j]);
                            }
                        }
                    }
                }
            }

            // 모든 정점을 방문한 상태
            for (int i = 0; i < N; i++) {
                // i에서 시작점으로 돌아가는 간선이 있으면 최종 경로 비용 갱신
                if (dp[size - 1][i] != INF && cost[i][start] != 0) {
                    globalMin = Math.min(globalMin, dp[size - 1][i] + cost[i][start]);
                }
            }
        }
        System.out.print(globalMin == INF ? 0 : globalMin);
    }

    private static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
