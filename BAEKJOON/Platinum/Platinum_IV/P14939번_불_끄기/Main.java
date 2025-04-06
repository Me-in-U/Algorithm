package BAEKJOON.Platinum.Platinum_IV.P14939번_불_끄기;

import java.io.IOException;

public class Main {
    private static final int SIZE = 10;
    private static final int[] dx = { 0, 0, 1, -1 };
    private static final int[] dy = { 1, -1, 0, 0 };
    private static boolean[][] isOn = new boolean[SIZE][SIZE];
    private static boolean[][] isOnCopy = new boolean[SIZE][];

    public static void main(String[] args) throws IOException {
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                isOn[x][y] = System.in.read() == 'O';
            }
            // System.in.read();
            System.in.read();
        }
        int minCount = solve();
        System.out.print(minCount == Integer.MAX_VALUE ? "-1" : minCount);
    }

    private static int solve() {
        int minCount = Integer.MAX_VALUE;
        // 첫 줄에 대해서 버튼을 누를 수 있는 모든 경우
        for (int mask = 0; mask < (1 << SIZE); mask++) {
            int tempCount = 0;
            // 배열 복사
            for (int x = 0; x < SIZE; x++) {
                isOnCopy[x] = isOn[x].clone();
            }
            for (int y = 0; y < SIZE; y++) {
                if ((mask & (1 << y)) != 0) {
                    pushSwitch(0, y);
                    tempCount++;
                }
            }
            // 첫 줄이 정해지면 이후 줄은 바로 위가 켜져있을때 누름
            for (int x = 1; x < SIZE; x++) {
                for (int y = 0; y < SIZE; y++) {
                    if (isOnCopy[x - 1][y]) {
                        pushSwitch(x, y);
                        tempCount++;
                    }
                }
            }
            // 불이 다 꺼져있는지 확인
            if (isAllOff()) {
                minCount = Math.min(minCount, tempCount);
            }
        }
        return minCount;
    }

    private static void pushSwitch(int x, int y) {
        isOnCopy[x][y] = !isOnCopy[x][y];
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            if (0 <= nx && nx < SIZE && 0 <= ny && ny < SIZE) {
                isOnCopy[nx][ny] = !isOnCopy[nx][ny];
            }
        }
    }

    public static boolean isAllOff() {
        for (int x = 0; x < SIZE; x++)
            for (int y = 0; y < SIZE; y++)
                if (isOnCopy[x][y])
                    return false;
        return true;
    }
}
