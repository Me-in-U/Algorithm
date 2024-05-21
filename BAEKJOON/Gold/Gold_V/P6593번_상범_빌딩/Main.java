package BAEKJOON.Gold.Gold_V.P6593번_상범_빌딩;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static class Position {
        int x;
        int y;
        int z;
        int time;

        Position(int x, int y, int z, int time) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.time = time;
        }
    }

    protected static int R;
    protected static int C;
    protected static int L;

    protected static int[] dx = { -1, 1, 0, 0, 0, 0 };
    protected static int[] dy = { 0, 0, -1, 1, 0, 0 };
    protected static int[] dz = { 0, 0, 0, 0, -1, 1 };
    protected static char[][][] map;
    protected static boolean[][][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        while (true) {
            st = new StringTokenizer(br.readLine());
            L = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            if (L == 0 && R == 0 && C == 0) {
                break;
            }
            map = new char[R][C][L];
            visited = new boolean[R][C][L];
            Position start = null;
            for (int l = 0; l < L; l++) {
                for (int r = 0; r < R; r++) {
                    String line = br.readLine();
                    for (int c = 0; c < C; c++) {
                        char cc = line.charAt(c);
                        map[r][c][l] = cc;
                        if (cc == 'S') {
                            map[r][c][l] = '.';
                            start = new Position(r, c, l, 0);
                            visited[r][c][l] = true;
                        }
                    }
                }
                br.readLine();
            }
            int time = bfs(start);
            if (time == -1) {
                sb.append("Trapped!");
            } else {
                sb.append("Escaped in ").append(time).append(" minute(s).");
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }

    public static int bfs(Position start) {
        Queue<Position> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            Position now = queue.poll();
            for (int i = 0; i < 6; i++) {
                int nextX = now.x + dx[i];
                int nextY = now.y + dy[i];
                int nextZ = now.z + dz[i];
                if ((0 <= nextX && nextX < R) && (0 <= nextY && nextY < C) && (0 <= nextZ && nextZ < L)) {
                    if (!visited[nextX][nextY][nextZ]) {
                        if (map[nextX][nextY][nextZ] == 'E') {
                            return now.time + 1;
                        } else if (map[nextX][nextY][nextZ] == '.') {
                            visited[nextX][nextY][nextZ] = true;
                            queue.add(new Position(nextX, nextY, nextZ, now.time + 1));
                        }
                    }
                }
            }
        }
        return -1;
    }
}