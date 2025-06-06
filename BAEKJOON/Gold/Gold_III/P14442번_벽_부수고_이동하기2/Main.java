package BAEKJOON.Gold.Gold_III.P14442번_벽_부수고_이동하기2;

/**
 * <h1>BAEKJOON 14442번 벽 부수고 이동하기2 GOLD III</h1>
 * <p>
 * JAVA 8 : 메모리 KB, 시간 ms <br>
 * JAVA11 : 메모리 KB, 시간 ms
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-03-12
 */

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    private static class Data {
        int x;
        int y;
        int useBreak;
        int distance;

        Data(int x, int y, int useBreak, int distance) {
            this.x = x;
            this.y = y;
            this.useBreak = useBreak;
            this.distance = distance;
        }
    }

    private static final int[] dx = { -1, 1, 0, 0 };
    private static final int[] dy = { 0, 0, -1, 1 };
    private static int N;
    private static int M;
    private static int K;
    private static int[][] wall;
    private static boolean[][][] visited;

    public static void main(String[] args) throws IOException {
        N = readInt();
        M = readInt();
        K = readInt();

        // ! 1X1 맵이면 이동할 곳 없음
        if (N == 1 && M == 1) {
            System.out.print("1");
        } else {
            wall = new int[N][M];
            visited = new boolean[K + 1][N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    wall[i][j] = (System.in.read() & 15);
                }
                // System.in.read(); // CR
                System.in.read(); // LF
            }
            System.out.print(bfs());
        }
    }

    public static int bfs() {
        Deque<Data> q = new ArrayDeque<>();
        // !{X, Y, isBreak, distance}
        q.add(new Data(0, 0, 0, 1));
        for (int i = 0; i <= K; i++) {
            visited[i][0][0] = true;
        }
        while (!q.isEmpty()) {
            Data now = q.pollFirst();
            // !(N, M)좌표에 도착
            if (now.x == N - 1 && now.y == M - 1) {
                return now.distance;
            }
            for (int d = 0; d < 4; d++) {
                int nx = now.x + dx[d];
                int ny = now.y + dy[d];
                if (0 <= nx && 0 <= ny && nx < N && ny < M) {
                    int nextUseBreak = now.useBreak;
                    // 다음칸이 벽이고
                    if (wall[nx][ny] == 1) {
                        // K번 벽을 부쉈거나 다음칸이 벽을 부수고 이동한적있는 칸이면 스킵
                        nextUseBreak = now.useBreak + 1; // 다음엔 부수고 이동하기
                        if (now.useBreak >= K || visited[nextUseBreak][nx][ny]) {
                            continue;
                        }
                    }
                    // 방문한적 없다면
                    if (!visited[nextUseBreak][nx][ny]) {
                        visited[nextUseBreak][nx][ny] = true; // 방문 처리
                        q.add(new Data(nx, ny, nextUseBreak, now.distance + 1));
                    }
                }
            }
        }
        return -1;
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