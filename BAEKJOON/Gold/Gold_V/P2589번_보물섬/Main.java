package BAEKJOON.Gold.Gold_V.P2589번_보물섬;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {
    private static int N, M;
    private static boolean[][] isLand;
    private static boolean[][] visited;
    private static int[] dx = { -1, 0, 1, 0 };
    private static int[] dy = { 0, -1, 0, 1 };

    private static class Pos {
        int x, y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static class Data {
        Pos pos;
        int dist;

        public Data(int x, int y, int dist) {
            this.pos = new Pos(x, y);
            this.dist = dist;
        }
    }

    public static void main(String[] args) throws IOException {
        N = readInt();
        M = readInt();
        isLand = new boolean[N][M];
        visited = new boolean[N][M];
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < M; y++) {
                isLand[x][y] = System.in.read() == 'L';
            }
            System.in.read();
            System.in.read();
        }

        Data bestFarthestPos = null;
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < M; y++) {
                if (isLand[x][y] && !visited[x][y]) {
                    Data farthestPos = bfs(x, y, new boolean[N][M]);
                    Data farthestPosOfFarthestPos = bfs(farthestPos.pos.x, farthestPos.pos.y, new boolean[N][M]);
                    if (bestFarthestPos == null || bestFarthestPos.dist < farthestPosOfFarthestPos.dist) {
                        bestFarthestPos = farthestPosOfFarthestPos;
                    }
                }
            }
        }
        System.out.println(bestFarthestPos.dist);
    }

    private static Data bfs(int x, int y, boolean[][] localVisited) {
        Deque<Data> dq = new ArrayDeque<>();
        int maxDist = 0;
        Data farthestPos = new Data(x, y, 0);
        dq.add(farthestPos);
        localVisited[x][y] = true;
        visited[x][y] = true;
        while (!dq.isEmpty()) {
            Data data = dq.pollFirst();
            int cx = data.pos.x;
            int cy = data.pos.y;
            int dist = data.dist;
            if (dist > maxDist) {
                maxDist = dist;
                farthestPos = data;
            }
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx < 0 || nx >= N || ny < 0 || ny >= M || localVisited[nx][ny] || !isLand[nx][ny])
                    continue;
                localVisited[nx][ny] = true;
                visited[nx][ny] = true;
                dq.add(new Data(nx, ny, dist + 1));
            }
        }
        return farthestPos;
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
