package dd;

import java.io.IOException;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    private static int N, M;
    private static int[][] map;
    private static int[][] distance;
    private static boolean[][] visited;
    private static final int[] DX = { 0, 0, -1, 1 };
    private static final int[] DY = { -1, 1, 0, 0 };

    private static class Point implements Comparable<Point> {
        int x, y, cost;

        Point(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }

        @Override
        public int compareTo(Point o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    public static void main(String[] args) throws IOException {
        N = readInt();
        M = readInt();
        map = new int[N][M];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                map[i][j] = readInt();
        dijkstra(0, 0);
        System.out.print(distance[N - 1][M - 1]);
    }

    private static void dijkstra(int startX, int startY) {
        distance = new int[N][M];
        visited = new boolean[N][M];
        for (int[] row : distance)
            Arrays.fill(row, Integer.MAX_VALUE);

        PriorityQueue<Point> pq = new PriorityQueue<>();
        distance[startY][startX] = map[startY][startX];
        pq.offer(new Point(startX, startY, distance[startY][startX]));

        while (!pq.isEmpty()) {
            Point current = pq.poll();
            int x = current.x;
            int y = current.y;
            int cost = current.cost;
            if (visited[y][x])
                continue;
            visited[y][x] = true;

            for (int dir = 0; dir < 4; dir++) {
                int nx = x + DX[dir];
                int ny = y + DY[dir];
                if (nx < 0 || nx >= M || ny < 0 || ny >= N)
                    continue;
                int nc = cost + map[ny][nx];
                if (nc < distance[ny][nx]) {
                    distance[ny][nx] = nc;
                    pq.offer(new Point(nx, ny, nc));
                }
            }
        }
    }

    private static int readInt() throws IOException {
        int c = System.in.read(), n = 0;
        boolean neg = false;
        while (c <= ' ')
            c = System.in.read();
        if (c == '-') {
            neg = true;
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = n * 10 + (c & 15);
            c = System.in.read();
        }
        return neg ? -n : n;
    }
}
