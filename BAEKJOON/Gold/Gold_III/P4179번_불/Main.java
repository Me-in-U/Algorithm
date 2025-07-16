package BAEKJOON.Gold.Gold_III.P4179번_불;

import java.io.IOException;
import java.util.*;

public class Main {
    private static int R, C;
    private static char[][] map;
    private static int[][] fireTime, jihunTime;
    private static final int[] DR = { -1, 1, 0, 0 };
    private static final int[] DC = { 0, 0, -1, 1 };

    public static void main(String[] args) throws IOException {
        R = readInt();
        C = readInt();
        map = new char[R][C];
        fireTime = new int[R][C];
        jihunTime = new int[R][C];

        // 초기화
        for (int i = 0; i < R; i++) {
            String line = nextLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = line.charAt(j);
                fireTime[i][j] = -1;
                jihunTime[i][j] = -1;
            }
        }

        Queue<int[]> fireQ = new ArrayDeque<>();
        Queue<int[]> jihunQ = new ArrayDeque<>();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] == 'F') {
                    fireQ.add(new int[] { i, j });
                    fireTime[i][j] = 0;
                } else if (map[i][j] == 'J') {
                    jihunQ.add(new int[] { i, j });
                    jihunTime[i][j] = 0;
                }
            }
        }

        // 불 BFS
        while (!fireQ.isEmpty()) {
            int[] cur = fireQ.poll();
            int r = cur[0];
            int c = cur[1];
            // 불 확산
            for (int d = 0; d < 4; d++) {
                int nr = r + DR[d];
                int nc = c + DC[d];
                if (nr < 0 || nr >= R || nc < 0 || nc >= C)
                    continue;
                if (map[nr][nc] == '#' || fireTime[nr][nc] != -1)
                    continue;
                fireTime[nr][nc] = fireTime[r][c] + 1;
                fireQ.add(new int[] { nr, nc });
            }
        }

        // 지훈 BFS
        while (!jihunQ.isEmpty()) {
            int[] cur = jihunQ.poll();
            int r = cur[0];
            int c = cur[1];
            // 탈출
            if (r == 0 || r == R - 1 || c == 0 || c == C - 1) {
                System.out.println(jihunTime[r][c] + 1);
                return;
            }
            // 이동 가능한 칸 탐색
            for (int d = 0; d < 4; d++) {
                int nr = r + DR[d];
                int nc = c + DC[d];
                if (nr < 0 || nr >= R || nc < 0 || nc >= C)
                    continue;
                if (map[nr][nc] == '#' || jihunTime[nr][nc] != -1)
                    continue;
                // 불보다 먼저 도착해야 이동 가능
                int nextTime = jihunTime[r][c] + 1;
                if (fireTime[nr][nc] != -1 && nextTime >= fireTime[nr][nc]) {
                    continue;
                }
                jihunTime[nr][nc] = nextTime;
                jihunQ.add(new int[] { nr, nc });
            }
        }
        System.out.println("IMPOSSIBLE");
    }

    private static int readInt() throws IOException {
        int c = System.in.read(), n = 0;
        while (c <= ' ')
            c = System.in.read();
        while ('0' <= c && c <= '9') {
            n = n * 10 + (c & 15);
            c = System.in.read();
        }
        return n;
    }

    private static String nextLine() throws IOException {
        StringBuilder sb = new StringBuilder();
        int c = System.in.read();
        while (c == '\r' || c == '\n')
            c = System.in.read();
        while (c != -1 && c != '\r' && c != '\n') {
            sb.append((char) c);
            c = System.in.read();
        }
        return sb.toString();
    }
}
