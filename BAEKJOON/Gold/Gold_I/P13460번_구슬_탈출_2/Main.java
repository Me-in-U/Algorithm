package BAEKJOON.Gold.Gold_I.P13460번_구슬_탈출_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static class Position {
        int x;
        int y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class State {
        Position red;
        Position blue;
        int moves;

        State(Position red, Position blue, int moves) {
            this.red = red;
            this.blue = blue;
            this.moves = moves;
        }
    }

    protected static char[][] map;
    protected static int N;
    protected static int M;
    protected static boolean[][][][] visited;
    protected static int[] dx = { -1, 1, 0, 0 };
    protected static int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        Position redStart = null;
        Position blueStart = null;
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'R') {
                    redStart = new Position(i, j);
                    map[i][j] = '.';
                } else if (map[i][j] == 'B') {
                    blueStart = new Position(i, j);
                    map[i][j] = '.';
                }
            }
        }
        visited = new boolean[N][M][N][M];
        int result = bfs(redStart, blueStart);
        System.out.println(result);
    }

    public static int bfs(Position redStart, Position blueStart) {
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(redStart, blueStart, 0));
        visited[redStart.x][redStart.y][blueStart.x][blueStart.y] = true;
        while (!queue.isEmpty()) {
            State currentState = queue.poll();
            if (currentState.moves >= 10)
                return -1;
            for (int i = 0; i < 4; i++) {
                State newState = move(currentState, dx[i], dy[i]);
                if (newState == null) {
                    continue;
                }
                if (map[newState.red.x][newState.red.y] == 'O') {
                    return currentState.moves + 1;
                }
                if (!visited[newState.red.x][newState.red.y][newState.blue.x][newState.blue.y]) {
                    visited[newState.red.x][newState.red.y][newState.blue.x][newState.blue.y] = true;
                    queue.add(new State(newState.red, newState.blue, currentState.moves + 1));
                }
            }
        }
        return -1;
    }

    public static State move(State state, int dx, int dy) {
        Position red = new Position(state.red.x, state.red.y);
        Position blue = new Position(state.blue.x, state.blue.y);
        boolean redInHole = false;
        boolean blueInHole = false;
        while (map[red.x + dx][red.y + dy] != '#' && map[red.x][red.y] != 'O') {
            red.x += dx;
            red.y += dy;
            if (map[red.x][red.y] == 'O') {
                redInHole = true;
                break;
            }
        }
        while (map[blue.x + dx][blue.y + dy] != '#' && map[blue.x][blue.y] != 'O') {
            blue.x += dx;
            blue.y += dy;
            if (map[blue.x][blue.y] == 'O') {
                blueInHole = true;
                break;
            }
        }
        if (blueInHole) {
            return null;
        }
        if (red.x == blue.x && red.y == blue.y) {
            if (redInHole) {
                return new State(red, blue, state.moves);
            }
            if (dx == 1) {
                if (state.red.x > state.blue.x) {
                    blue.x -= 1;
                } else {
                    red.x -= 1;
                }
            } else if (dx == -1) {
                if (state.red.x > state.blue.x) {
                    red.x += 1;
                } else {
                    blue.x += 1;
                }
            } else if (dy == 1) {
                if (state.red.y > state.blue.y) {
                    blue.y -= 1;
                } else {
                    red.y -= 1;
                }
            } else {
                if (state.red.y > state.blue.y) {
                    red.y += 1;
                } else {
                    blue.y += 1;
                }
            }
        }
        return new State(red, blue, state.moves);
    }
}
