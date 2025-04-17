package BAEKJOON.Gold.Gold_III.P1520번_내리막_길;

import java.io.IOException;

public class Main {
    private static class Pos {
        int x, y;

        Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static final int[] dx = { 0, 0, -1, 1 };
    private static final int[] dy = { -1, 1, 0, 0 };
    private static int count = 0, N, M;
    private static int[][] map;

    public static void main(String[] args) throws IOException {
        // ! MN반대로
        N = readInt(); // 세로
        M = readInt(); // 가로
        map = new int[N][M];
        for (int x = 0; x < N; x++)
            for (int y = 0; y < M; y++)
                map[x][y] = readInt();
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
