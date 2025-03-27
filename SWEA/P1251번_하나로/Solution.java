package SWEA.P1251번_하나로;

import java.io.IOException;
import java.util.Arrays;

public class Solution {
    private static int N;
    private static int[] parent;
    private static Edge[] edges;
    private static Node[] nodes;
    private static double totalDistance;

    public static class Node {
        int x, y;

        Node(int x) {
            this.x = x;
        }
    }

    public static class Edge implements Comparable<Edge> {
        int node1;
        int node2;
        double distance;

        Edge(int node1, int node2, double distance) {
            this.node1 = node1;
            this.node2 = node2;
            this.distance = distance;
        }

        @Override
        public int compareTo(Edge e) {
            return Double.compare(this.distance, e.distance);
        }
    }

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            N = readInt();
            parent = new int[N + 1];
            nodes = new Node[N];
            totalDistance = 0;
            for (int i = 1; i <= N; i++) {
                parent[i] = i;
            }
            for (int i = 0; i < N; i++) {
                int x = readInt();
                nodes[i] = new Node(x);
            }
            for (int i = 0; i < N; i++) {
                int y = readInt();
                nodes[i].y = y;
            }
            int edgeCount = 0;
            for (int i = 1; i < N; i++) {
                edgeCount += i;
            }
            edges = new Edge[edgeCount];
            double tax = readDouble();
            int index = 0;
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    double distance = Math.pow(nodes[i].x - nodes[j].x, 2) + Math.pow(nodes[i].y - nodes[j].y, 2);
                    edges[index++] = new Edge(i, j, distance);
                }
            }
            Arrays.sort(edges);
            for (int i = 0; i < edgeCount; i++) {
                Edge edge = edges[i];
                if (find(edge.node1) == find(edge.node2))
                    continue;
                totalDistance += edge.distance;
                union(edge.node1, edge.node2);
            }
            sb.append("#").append(t).append(" ").append(Math.round(totalDistance * tax)).append('\n');
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
        int c, n = 0;
        while ((c = System.in.read()) > 47)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }

    private static double readDouble() throws IOException {
        int c;
        double n = 0;

        // 정수 부분 읽기
        while ((c = System.in.read()) > 47)
            n = n * 10 + (c & 15);

        // 소수점이 나오면 소수 부분 읽기
        if (c == '.') {
            double fraction = 0;
            double factor = 1;
            while ((c = System.in.read()) > 47 && c < 58) {
                fraction = fraction * 10 + (c & 15);
                factor *= 10;
            }
            n += fraction / factor;
        }
        if (c == 13)
            System.in.read();
        return n;
    }

}