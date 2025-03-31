package SWEA.P3124번_최소_스패닝_트리;

/**
 * <h1>SW Expert Academy 번</h1>
 * <h1>BAEKJOON 번</h1>
 * <p>
 * JAVA 8 : 메모리 99,612 KB, 시간 2,103ms <br>
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-03-27
 */
import java.io.IOException;
import java.util.Arrays;

public class Solution_3124_최소스패닝트리_김민규 {
    private static int V;
    private static int E;
    private static int[] parent;
    private static Edge[] edges;
    private static long weight; // weight 초기화

    public static class Edge implements Comparable<Edge> {
        int node1;
        int node2;
        int cost;

        Edge(int node1, int node2, int cost) {
            this.node1 = node1;
            this.node2 = node2;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge e) {
            return this.cost - e.cost; // 비용을 기준으로 정렬
        }
    }

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            V = readInt();
            E = readInt();
            parent = new int[V + 1];
            edges = new Edge[E];
            weight = 0;
            for (int i = 1; i < V + 1; i++) {
                parent[i] = i;
            }
            for (int i = 0; i < E; i++) {
                int node1 = readInt();
                int node2 = readInt();
                int cost = readInt();
                edges[i] = new Edge(node1, node2, cost);
            }
            Arrays.sort(edges); // 간선을 비용 오름차순으로 정렬
            for (int i = 0; i < E; i++) {
                Edge edge = edges[i];
                if (find(edge.node1) == find(edge.node2))
                    continue;
                weight += edge.cost;
                union(edge.node1, edge.node2);
            }
            sb.append("#").append(t).append(" ").append(weight).append('\n');
        }
        System.out.print(sb.toString());
    }

    public static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x > y)
            parent[x] = y;
        else
            parent[y] = x;
    }

    public static int find(int x) {
        if (parent[x] == x)
            return x;
        return parent[x] = find(parent[x]);
    }

    private static int readInt() throws IOException {
        int n = 0;
        int c = System.in.read();
        boolean isNegative = false;
        while (c <= 32) {
            c = System.in.read();
        }
        if (c == '-') {
            isNegative = true;
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c - '0');
            c = System.in.read();
        }
        return isNegative ? -n : n;
    }
}