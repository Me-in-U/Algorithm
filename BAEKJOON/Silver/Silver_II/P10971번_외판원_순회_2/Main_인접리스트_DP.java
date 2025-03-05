package P10971번_외판원_순회_2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_인접리스트_DP {
    static int N;
    static List<int[]>[] graph;
    static final int INF = 1000000000;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        N = readInt();
        graph = new ArrayList[N];
        for (int from = 0; from < N; from++) {
            graph[from] = new ArrayList<>();
            for (int to = 0; to < N; to++) {
                int cost = readInt();
                if (cost != 0) {
                    graph[from].add(new int[] { to, cost });
                }
            }
        }

        int size = 1 << N;
        int globalMin = INF;

        // 모든 노드가 시작점이 될 수 있도록 반복
        for (int start = 0; start < N; start++) {
            // dp[mask][i]: 시작점 start에서 시작하여 mask에 포함된 노드들을 방문하고, 현재 i번에 있을 때의 최소 비용
            int[][] dp = new int[size][N];
            for (int i = 0; i < size; i++) {
                Arrays.fill(dp[i], INF);
            }
            dp[1 << start][start] = 0;

            // 상태 전이 : mask에 포함된 각 정점 i에서 갈 수 있는 간선 j로 이동
            for (int mask = 0; mask < size; mask++) {
                for (int i = 0; i < N; i++) {
                    if ((mask & (1 << i)) != 0 && dp[mask][i] != INF) {
                        // i에서 갈 수 있는 간선 탐색
                        for (int[] edge : graph[i]) {
                            int j = edge[0];
                            int cost = edge[1];
                            if ((mask & (1 << j)) == 0) {
                                int nextMask = mask | (1 << j);
                                dp[nextMask][j] = Math.min(dp[nextMask][j], dp[mask][i] + cost);
                            }
                        }
                    }
                }
            }

            // 모든 정점을 방문한 상태
            int fullMask = size - 1;
            // i번 정점에서 시작점 start로 돌아갈 수 있는지 확인하여 최솟값 갱신
            for (int i = 0; i < N; i++) {
                if (dp[fullMask][i] != INF) {
                    for (int[] edge : graph[i]) {
                        if (edge[0] == start) {
                            globalMin = Math.min(globalMin, dp[fullMask][i] + edge[1]);
                        }
                    }
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
