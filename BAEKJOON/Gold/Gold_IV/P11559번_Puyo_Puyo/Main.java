package BAEKJOON.Gold.Gold_IV.P11559번_Puyo_Puyo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Main {
    static final char DOT = '.';
    static char[][] map = new char[12][6];
    static boolean[][] visited;
    static char topPosition = 0;
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (char i = 0; i < 12; i++) {
            String line = br.readLine();
            for (char j = 0; j < 6; j++) {
                map[i][j] = line.charAt(j);
            }
        }
        newTopPosition();
        int chain = 0;
        while (breakPuyo()) {
            chain++;
            moveDownPuyo();
        }
        System.out.println(chain);
    }

    private static boolean breakPuyo() {
        visited = new boolean[12][6];
        boolean isBroken = false;
        for (int i = topPosition; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                if (map[i][j] != DOT && !visited[i][j]) {
                    boolean partialBroken = bfs(i, j);
                    isBroken = partialBroken || isBroken;
                }
            }
        }
        return isBroken;
    }

    private static boolean bfs(int i, int j) {
        int count = 1;
        Queue<int[]> queue = new LinkedList<>();
        Set<int[]> visitedSet = new HashSet<>();
        char color = map[i][j];
        visited[i][j] = true;
        queue.add(new int[] { i, j });
        visitedSet.add(new int[] { i, j });
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int k = 0; k < 4; k++) {
                int nextX = now[0] + dx[k];
                int nextY = now[1] + dy[k];
                if (topPosition <= nextX && nextX < 12 && 0 <= nextY && nextY < 6) {
                    if (map[nextX][nextY] == color && !visited[nextX][nextY]) {
                        visited[nextX][nextY] = true;
                        count++;
                        queue.add(new int[] { nextX, nextY });
                        visitedSet.add(new int[] { nextX, nextY });
                    }
                }
            }
        }
        if (count >= 4) {
            for (int[] boom : visitedSet) {
                map[boom[0]][boom[1]] = DOT;
            }
            return true;
        }
        return false;
    }

    private static void moveDownPuyo() {
        for (int j = 0; j < 6; j++) {
            int insertIndex = 11;
            for (int i = 11; i >= topPosition; i--) {
                if (map[i][j] != DOT) {
                    map[insertIndex][j] = map[i][j];
                    if (insertIndex != i) {
                        map[i][j] = DOT;
                    }
                    insertIndex--;
                }
            }
        }
        newTopPosition();
    }

    public static void newTopPosition() {
        boolean found = false;
        for (char i = topPosition; i < 12; i++) {
            for (char j = 0; j < 6; j++) {
                if (map[i][j] != DOT) {
                    topPosition = i;
                    found = true;
                }
            }
            if (found) {
                break;
            }
        }
    }

    public static void printMap() {
        System.out.println("---------");
        for (int k = 0; k < 12; k++) {
            for (int o = 0; o < 6; o++) {
                System.out.print(map[k][o]);
            }
            System.out.println();
        }
    }
}