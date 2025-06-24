package dd.nm;

import java.io.IOException;
import java.util.PriorityQueue;

public class Main {
    private static int N, M;
    private static int[][] map;
    private static int[][] dist;
    private static final int[] DX = { 0, 0, -1, 1 };
    private static final int[] DY = { -1, 1, 0, 0 };
    private static final int INF = Integer.MAX_VALUE / 2;

    private static class Node implements Comparable<Node> {
        int y, x, cost;

        Node(int y, int x, int cost) {
            this.y = y;
            this.x = x;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    public static void main(String[] args) throws IOException {
        N = readInt();
        M = readInt();
        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = readInt();
            }
        }
        dist = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                dist[i][j] = INF;
            }
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[0][0] = map[0][0];
        pq.offer(new Node(0, 0, dist[0][0]));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            int x = cur.x;
            int y = cur.y;
            int cost = cur.cost;
            if (cost > dist[y][x])
                continue;
            if (y == N - 1 && x == M - 1)
                break;
            for (int d = 0; d < 4; d++) {
                int nx = x + DX[d];
                int ny = y + DY[d];
                if (ny < 0 || ny >= N || nx < 0 || nx >= M)
                    continue;
                int nc = cost + map[ny][nx];
                if (nc < dist[ny][nx]) {
                    dist[ny][nx] = nc;
                    pq.offer(new Node(ny, nx, nc));
                }
            }
        }

        System.out.println(dist[N - 1][M - 1]);
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
