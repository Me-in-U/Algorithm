package dd.quiz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    private static int N;
    private static int T;
    private static List<Edge>[] graph;
    private static final long INF = Long.MAX_VALUE / 4; // W*T(30억) 이상 적당히

    private static class Edge {
        int to, w;

        Edge(int to, int w) {
            this.to = to;
            this.w = w;
        }
    }

    private static class Node implements Comparable<Node> {
        int v;
        long cost;

        Node(int v, long cost) {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return Long.compare(this.cost, o.cost);
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        N = readInt();
        T = readInt();

        graph = new ArrayList[N];
        for (int i = 0; i < N; i++)
            graph[i] = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            int a = readInt(), b = readInt(), w = readInt();
            graph[a].add(new Edge(b, w));
        }

        long result = dijkstra(0, N - 1);
        System.out.println(result < 0 ? "impossible" : result);
    }

    private static long dijkstra(int start, int target) {
        long[] dist = new long[N];
        for (int i = 0; i < N; i++)
            dist[i] = INF;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[start] = 0;
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            if (current.cost > dist[current.v])
                continue;
            if (current.v == target)
                return current.cost;

            for (Edge edge : graph[current.v]) {
                long nc = current.cost + edge.w;
                if (nc < dist[edge.to]) {
                    dist[edge.to] = nc;
                    pq.offer(new Node(edge.to, nc));
                }
            }
        }
        return (dist[target] >= INF) ? -1 : dist[target];
    }

    private static int readInt() throws IOException {
        int c = System.in.read(), n = 0;
        boolean isNegative = false;
        while (c <= ' ') {
            c = System.in.read();
        }
        if (c == '-') {
            isNegative = true;
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return isNegative ? -n : n;
    }
}
