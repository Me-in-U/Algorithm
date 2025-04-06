package BAEKJOON.Platinum.Platinum_IV.P11375번_열혈강호;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class MainBFSDFS {
    private static int N, M;
    private static List<Integer>[] graph;
    private static int[] pairU, pairV, dist;
    private static final int INF = 1000000000;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        N = readInt();
        M = readInt();
        graph = new ArrayList[N + 1];
        for (int u = 1; u <= N; u++) {
            int count = readInt();
            graph[u] = new ArrayList<>(count);
            for (int j = 0; j < count; j++) {
                graph[u].add(readInt());
            }
        }
        pairU = new int[N + 1];
        pairV = new int[M + 1];
        dist = new int[N + 1];
        int matching = 0;
        while (bfs()) {
            for (int u = 1; u <= N; u++) {
                if (pairU[u] == 0 && dfs(u)) {
                    matching++;
                }
            }
        }
        System.out.print(matching);
    }

    private static boolean bfs() {
        Deque<Integer> queue = new ArrayDeque<>();
        for (int u = 1; u <= N; u++) {
            if (pairU[u] == 0) {
                dist[u] = 0;
                queue.offer(u);
            } else {
                dist[u] = INF;
            }
        }
        dist[0] = INF;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            if (dist[u] < dist[0]) {
                for (int v : graph[u]) {
                    if (pairV[v] == 0) {
                        dist[0] = dist[u] + 1;
                    } else if (dist[pairV[v]] == INF) {
                        dist[pairV[v]] = dist[u] + 1;
                        queue.offer(pairV[v]);
                    }
                }
            }
        }
        return dist[0] != INF;
    }

    private static boolean dfs(int u) {
        if (u != 0) {
            for (int v : graph[u]) {
                if (pairV[v] == 0 || (dist[pairV[v]] == dist[u] + 1 && dfs(pairV[v]))) {
                    pairU[u] = v;
                    pairV[v] = u;
                    return true;
                }
            }
            dist[u] = INF;
            return false;
        }
        return true;
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
