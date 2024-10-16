package P3055번_탈출;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static class Position {
        int x;
        int y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static boolean reached = false;
    private static boolean unable = false;
    private static boolean[][] visited;
    private static char[][] map;
    private static Deque<Position> hedgehog;
    private static Deque<Position> water;
    private static int[] dx = { -1, 1, 0, 0 };
    private static int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        visited = new boolean[R][C];
        hedgehog = new ArrayDeque<>();
        water = new ArrayDeque<>();
        for (int i = 0; i < R; i++) {
            String line = br.readLine();
            for (int j = 0; j < C; j++) {
                char c = line.charAt(j);
                map[i][j] = c;
                if (c == 'S') {
                    hedgehog.add(new Position(i, j));
                    visited[i][j] = true;
                    map[i][j] = '.';
                } else if (c == '*') {
                    water.add(new Position(i, j));
                }
            }
        }
        int time = 0;
        while (!reached) {
            BFS();
            if (unable)
                break;
            time++;
        }
        System.out.println(reached ? time : "KAKTUS");
    }

    private static void BFS() {
        Deque<Position> temp1 = new ArrayDeque<>();
        while (!water.isEmpty()) {
            Position pos = water.poll();
            for (int i = 0; i < 4; i++) {
                int x = pos.x + dx[i];
                int y = pos.y + dy[i];
                if (x >= 0 && x < map.length && y >= 0 && y < map[0].length) {
                    if (map[x][y] == '.' && map[x][y] != 'X' && map[x][y] != 'D') {
                        map[x][y] = '*';
                        temp1.add(new Position(x, y));
                    }
                }
            }
        }
        water = temp1;

        Deque<Position> temp2 = new ArrayDeque<>();
        while (!hedgehog.isEmpty()) {
            Position pos = hedgehog.poll();
            for (int i = 0; i < 4; i++) {
                int x = pos.x + dx[i];
                int y = pos.y + dy[i];
                if (x >= 0 && x < map.length && y >= 0 && y < map[0].length) {
                    if (map[x][y] == '.' && map[x][y] != '*' && map[x][y] != 'X' && !visited[x][y]) {
                        visited[x][y] = true;
                        temp2.add(new Position(x, y));
                    } else if (map[x][y] == 'D') {
                        reached = true;
                        return;
                    }
                }
            }
        }
        if (temp2.isEmpty()) {
            unable = true;
            return;
        }
        hedgehog = temp2;
    }
}