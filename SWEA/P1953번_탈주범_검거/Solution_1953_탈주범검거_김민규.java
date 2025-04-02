package SWEA.P1953번_탈주범_검거;

/**
 * <h1>SW Expert Academy 1953번 탈주범 검거</h1>
 * <p>
 * JAVA 8 : 메모리 26,624 KB, 시간 92ms <br>
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-04-02
 */

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution_1953_탈주범검거_김민규 {
    private static class Pos {
        int x, y;

        Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int N, M, R, C, L;
    private static int[][] tunnel;
    private static boolean[][] visited;
    private static final int[] dx = { -1, 0, 1, 0 };
    private static final int[] dy = { 0, 1, 0, -1 };
    private static int[][] direction = { null, { 0, 1, 2, 3 }, { 0, 2 }, { 1, 3 }, { 0, 1 }, { 1, 2 }, { 2, 3 },
            { 0, 3 } };

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            // 입력 및 초기화
            N = readInt();// 지하 터널 지도의 세로 크기
            M = readInt();// 지하 터널 지도의 가로 크기
            R = readInt();// 맨홀 뚜껑이 위치한 장소의 세로 위치
            C = readInt();// 맨홀 뚜껑이 위치한 장소의 가로 위치
            L = readInt();// 탈출 후 소요된 시간
            tunnel = new int[N][M];
            visited = new boolean[N][M];
            for (int x = 0; x < N; x++)
                for (int y = 0; y < M; y++)
                    tunnel[x][y] = readInt();

            // solve
            int result = bfs();
            sb.append("#").append(t).append(" ").append(result).append("\n");
        }
        System.out.print(sb.toString());
    }

    private static int bfs() {
        Deque<Pos> dq = new ArrayDeque<>();
        dq.add(new Pos(R, C));
        visited[R][C] = true;
        L--;
        int count = 1;
        while (L-- > 0) {
            int size = dq.size();
            while (size-- > 0) {
                Pos pos = dq.poll();
                for (int dir : direction[tunnel[pos.x][pos.y]]) {
                    int nx = pos.x + dx[dir];
                    int ny = pos.y + dy[dir];
                    if (isInRange(nx, ny) && !visited[nx][ny] && isConnected(nx, ny, dir)) {
                        visited[nx][ny] = true;
                        dq.add(new Pos(nx, ny));
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static boolean isInRange(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < M;
    }

    private static boolean isConnected(int nx, int ny, int currentDir) {
        int nextType = tunnel[nx][ny];
        if (currentDir == 0) {
            if (nextType == 1 || nextType == 2 || nextType == 5 || nextType == 6) {
                return true;
            }
        } else if (currentDir == 1) {
            if (nextType == 1 || nextType == 3 || nextType == 6 || nextType == 7) {
                return true;
            }
        } else if (currentDir == 2) {
            if (nextType == 1 || nextType == 2 || nextType == 4 || nextType == 7) {
                return true;
            }
        } else if (currentDir == 3) {
            if (nextType == 1 || nextType == 3 || nextType == 4 || nextType == 5) {
                return true;
            }
        }
        return false;
    }

    private static int readInt() throws IOException {
        int c, n = 0;
        while ((c = System.in.read()) > 47)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
