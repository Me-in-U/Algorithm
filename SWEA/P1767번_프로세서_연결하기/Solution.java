package SWEA.P1767번_프로세서_연결하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public static class Data implements Comparable<Data> {
        static final Data upCant = new Data(100, 0);
        static final Data downCant = new Data(100, 1);
        static final Data leftCant = new Data(100, 2);
        static final Data rightCant = new Data(100, 3);
        int length;
        int dir;

        Data(int length, int dir) {
            this.length = length;
            this.dir = dir;
        }

        @Override
        public int compareTo(Data o) {
            return Integer.compare(this.length, o.length);
        }
    }

    public static class Core {
        int x, y;
        Data[] data = null;
        boolean isOnEdge = false;

        // direction
        // 0 - up, 1 - down, 2 - left, 3 - right

        Core(int x, int y, int N) {
            this.x = x;
            this.y = y;
            if (x == 0 || x == N - 1 || y == 0 || y == N - 1) {
                isOnEdge = true;
            } else {
                data = new Data[4];
            }
        }
    }

    private static int[][] map;
    private static int[][] line;
    private static List<Core> cores;
    private static int[] dx = { -1, 1, 0, 0 };
    private static int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            int N = readInt();
            map = new int[N][N];
            cores = new ArrayList<>();
            for (int x = 0; x < N; x++) {
                for (int y = 0; y < N; y++) {
                    if ((line[x][y] = map[x][y] = readInt()) == 1) {
                        cores.add(new Core(x, y, N));
                    }
                }
            }
            for (Core core1 : cores) {
                Data upTemp = null;
                Data downTemp = null;
                Data leftTemp = null;
                Data rightTemp = null;
                for (Core core2 : cores) {
                    if (upTemp != Data.upCant) {
                        upTemp = core1.x < core2.x ? new Data(core1.x - 1, 0) : Data.upCant;
                    }
                    if (downTemp != Data.downCant) {
                        downTemp = core1.x > core2.x ? new Data(N - core1.x, 0) : Data.downCant;
                    }
                    if (leftTemp != Data.leftCant) {
                        leftTemp = core1.y < core2.y ? new Data(core1.y - 1, 0) : Data.leftCant;
                    }
                    if (rightTemp != Data.rightCant) {
                        rightTemp = core1.y > core2.y ? new Data(N - core1.y, 0) : Data.rightCant;
                    }
                }
                core1.data[0] = upTemp;
                core1.data[1] = downTemp;
                core1.data[2] = leftTemp;
                core1.data[3] = rightTemp;
            }
            for (Core core : cores) {
                Arrays.sort(core.data);
            }
            dfs(0, 0, 0);
        }
    }

    private static void dfs(int selectedCore, int connectedCored, int lineLength) {
        for (int coreIndex = selectedCore; coreIndex < cores.size(); coreIndex++) {
            if (cores.get(coreIndex).isOnEdge) {
                dfs(coreIndex + 1, connectedCored + 1, lineLength);
                return;
            } else {
                for (int dirIndex = 0; dirIndex < 4; dirIndex++) {
                    int length = cores.get(coreIndex).data[dirIndex].length;
                    int dir = cores.get(coreIndex).data[dirIndex].dir;
                    if (length != 100) {

                    }
                }
            }
        }
    }

    public static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
