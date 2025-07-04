package SWEA.P고속도로_건설_2;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    private static class Edge implements Comparable<Edge> {
        int u;
        int v;
        int w;

        public Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(this.w, o.w);
        }
    }

    private static int[] parent;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = readInt();
            int M = readInt();

            Edge[] edges = new Edge[M];
            for (int i = 0; i < M; i++) {
                int s = readInt();
                int e = readInt();
                int c = readInt();
                edges[i] = new Edge(s, e, c);
            }

            Arrays.sort(edges);
            parent = new int[N + 1];
            for (int i = 1; i <= N; i++)
                parent[i] = i;

            long costSum = 0;
            int count = 0;
            for (Edge edge : edges) {
                if (union(edge.u, edge.v)) {
                    costSum += edge.w;
                    if (++count == N - 1)
                        break;
                }
            }
            sb.append("#").append(tc).append(" ").append(costSum).append("\n");
        }
        System.out.print(sb);
    }

    private static int find(int x) {
        if (parent[x] == x)
            return x;
        return parent[x] = find(parent[x]);
    }

    private static boolean union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a == b)
            return false;
        parent[b] = a;
        return true;
    }

    private static int readInt() throws IOException {
        int c = System.in.read(), n = 0;
        while (c <= ' ')
            c = System.in.read();
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
