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
        static final Data upCant = new Data(Integer.MAX_VALUE, 0);
        static final Data downCant = new Data(Integer.MAX_VALUE, 1);
        static final Data leftCant = new Data(Integer.MAX_VALUE, 2);
        static final Data rightCant = new Data(Integer.MAX_VALUE, 3);
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

        Core(int x, int y) {
            this.x = x;
            this.y = y;
            if (x == 0 || x == N - 1 || y == 0 || y == N - 1) {
                isOnEdge = true;
                data = new Data[] { Data.upCant, Data.downCant, Data.leftCant, Data.rightCant };
            } else {
                data = new Data[4];
            }
        }

        // dir: 0(상), 1(하), 2(좌), 3(우)
        boolean connectLine(int dir) {
            int x = this.x, y = this.y;
            if (dir == 0) { // 상: 위쪽으로 (행 감소)
                for (int i = x - 1; i >= 0; i--) {
                    if (map[i][y] == 1 || line[i][y])
                        return false;
                }
                for (int i = x - 1; i >= 0; i--) {
                    line[i][y] = true;
                }
            } else if (dir == 1) { // 하: 아래쪽 (행 증가)
                for (int i = x + 1; i < N; i++) {
                    if (map[i][y] == 1 || line[i][y])
                        return false;
                }
                for (int i = x + 1; i < N; i++) {
                    line[i][y] = true;
                }
            } else if (dir == 2) { // 좌: 왼쪽 (열 감소)
                for (int j = y - 1; j >= 0; j--) {
                    if (map[x][j] == 1 || line[x][j])
                        return false;
                }
                for (int j = y - 1; j >= 0; j--) {
                    line[x][j] = true;
                }
            } else if (dir == 3) { // 우: 오른쪽 (열 증가)
                for (int j = y + 1; j < N; j++) {
                    if (map[x][j] == 1 || line[x][j])
                        return false;
                }
                for (int j = y + 1; j < N; j++) {
                    line[x][j] = true;
                }
            }
            return true;
        }

        void disconnectLine(int dir) {
            int x = this.x, y = this.y;
            if (dir == 0) { // 상
                for (int i = x - 1; i >= 0; i--) {
                    line[i][y] = false;
                }
            } else if (dir == 1) { // 하
                for (int i = x + 1; i < N; i++) {
                    line[i][y] = false;
                }
            } else if (dir == 2) { // 좌
                for (int j = y - 1; j >= 0; j--) {
                    line[x][j] = false;
                }
            } else if (dir == 3) { // 우
                for (int j = y + 1; j < N; j++) {
                    line[x][j] = false;
                }
            }
        }
    }

    private static int[][] map;
    private static boolean[][] line;
    private static List<Core> cores;
    private static int N;
    private static int maxCoreCount;
    private static int minLineCount;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            N = readInt();
            map = new int[N][N];
            line = new boolean[N][N];
            cores = new ArrayList<>();
            maxCoreCount = 0;
            minLineCount = Integer.MAX_VALUE;
            for (int x = 0; x < N; x++) {
                for (int y = 0; y < N; y++) {
                    if ((map[x][y] = readInt()) == 1) {
                        line[x][y] = true;
                        cores.add(new Core(x, y));
                    }
                }
            }
            for (Core core : cores) {
                if (core.isOnEdge)
                    continue;
                // 상: core.x, 하: (N-1 - core.x), 좌: core.y, 우: (N-1 - core.y)
                Data upTemp = new Data(core.x, 0);
                Data downTemp = new Data(N - 1 - core.x, 1);
                Data leftTemp = new Data(core.y, 2);
                Data rightTemp = new Data(N - 1 - core.y, 3);
                core.data[0] = upTemp;
                core.data[1] = downTemp;
                core.data[2] = leftTemp;
                core.data[3] = rightTemp;
            }
            for (Core core : cores) {
                if (!core.isOnEdge)
                    Arrays.sort(core.data);
            }
            dfs(0, 0, 0);
            sb.append('#').append(t).append(' ').append(minLineCount).append('\n');
        }
        System.out.print(sb.toString());
    }

    private static void dfs(int selectedCore, int connectedCored, int lineLength) {
        if (selectedCore == cores.size()) {
            if (connectedCored > maxCoreCount) {
                maxCoreCount = connectedCored;
                minLineCount = lineLength;
            } else if (connectedCored == maxCoreCount) {
                minLineCount = Math.min(minLineCount, lineLength);
            }
            return;
        }

        Core core = cores.get(selectedCore);
        // 가장자리 코어는 이미 연결된 것으로 간주
        if (core.isOnEdge) {
            dfs(selectedCore + 1, connectedCored + 1, lineLength);
        } else {
            for (int d = 0; d < 4; d++) {
                int length = core.data[d].length;
                int dir = core.data[d].dir;
                if (length == Integer.MAX_VALUE)
                    continue;
                if (core.connectLine(dir)) {
                    // 연결 성공
                    dfs(selectedCore + 1, connectedCored + 1, lineLength + length);
                    core.disconnectLine(dir);
                }
            }
            // 해당 코어를 연결하지 않는 경우도 고려
            dfs(selectedCore + 1, connectedCored, lineLength);
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
