package BAEKJOON.Gold.Gold_II.P16946번_벽_부수고_이동하기_4;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    private static class CountData {
        int count;
        boolean added;

        CountData() {
            this.count = 1;
        }
    }

    private static final int[] dx = { -1, 1, 0, 0 };
    private static final int[] dy = { 0, 0, -1, 1 };
    private static int N;
    private static int M;
    private static boolean[][] wall;
    private static boolean[][] visited;
    private static CountData[][] bfsData;

    public static void main(String[] args) throws IOException {
        N = readInt();
        M = readInt();
        visited = new boolean[N][M];
        bfsData = new CountData[N][M];
        // ! 1X1 맵이면 이동할 곳 없음
        if (N == 1 && M == 1) {
            System.out.print(System.in.read() & 15);
            return;
        } else {
            wall = new boolean[N][M];
            for (int x = 0; x < N; x++) {
                for (int y = 0; y < M; y++) {
                    wall[x][y] = (System.in.read() & 15) == 1;
                }
                // System.in.read(); // CR
                System.in.read(); // LF
            }
        }
        bfsHelper();
        System.out.println(printMaxMoves());
    }

    private static void bfsHelper() {
        for (int x = 0; x < N; x++)
            for (int y = 0; y < M; y++)
                if (!visited[x][y] && !wall[x][y])
                    bfs(x, y);
    }

    private static void bfs(int x, int y) {
        Deque<int[]> q = new ArrayDeque<>();
        CountData data = new CountData();
        visited[x][y] = true;
        bfsData[x][y] = data;
        q.offerLast(new int[] { x, y });
        while (!q.isEmpty()) {
            int[] c = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = c[0] + dx[i];
                int ny = c[1] + dy[i];
                if (0 <= nx && 0 <= ny && nx < N && ny < M && !visited[nx][ny] && !wall[nx][ny]) {
                    visited[nx][ny] = true;
                    bfsData[nx][ny] = data;
                    q.offerLast(new int[] { nx, ny });
                    data.count++;
                }
            }
        }
        data.count %= 10;
    }

    private static String printMaxMoves() {
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < M; y++) {
                if (wall[x][y]) {
                    int count = 1;
                    for (int i = 0; i < 4; i++) {
                        int nx = x + dx[i];
                        int ny = y + dy[i];
                        if (0 <= nx && 0 <= ny && nx < N && ny < M && !wall[nx][ny] && !bfsData[nx][ny].added) {
                            count += bfsData[nx][ny].count;
                            bfsData[nx][ny].added = true;
                        }
                    }
                    for (int i = 0; i < 4; i++) {
                        int nx = x + dx[i];
                        int ny = y + dy[i];
                        if (0 <= nx && 0 <= ny && nx < N && ny < M && !wall[nx][ny]) {
                            bfsData[nx][ny].added = false;
                        }
                    }
                    sb.append(count % 10);
                } else {
                    sb.append("0");
                }
            }
            sb.append("\n");
        }
        return sb.toString().trim();
    }

    private static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        // if (c == 13)
        // System.in.read();
        return n;
    }
}
