package SWEA.P1210_Ladder1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    static class Solver {
        private boolean[][] ladder;
        private int nowX;
        private int nowY;

        public Solver(boolean[][] ladder, int nowY) {
            this.ladder = ladder;
            this.nowX = SIZE - 1;
            this.nowY = nowY;
        }

        public int solve() {
            // 상단(0행)에 도달할 때까지 탐색
            while (nowX > 0) {
                if (canMoveLeft()) {
                    while (canMoveLeft()) {
                        nowY--;
                    }
                    nowX--;
                } else if (canMoveRight()) {
                    while (canMoveRight()) {
                        nowY++;
                    }
                    nowX--;
                } else {
                    nowX--;
                }
            }
            return nowY;
        }

        private boolean canMoveLeft() {
            return (nowY - 1 >= 0 && ladder[nowX][nowY - 1]);
        }

        private boolean canMoveRight() {
            return (nowY + 1 < SIZE && ladder[nowX][nowY + 1]);
        }
    }

    private static final int SIZE = 100;

    public static void main(String[] args) throws IOException {
        // System.setIn(
        // new
        // FileInputStream("C:\\Users\\SSAFY\\Documents\\GitHub\\Algorithm\\SWEA\\P1210_Ladder1\\input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = 10;
        while (T-- > 0) {
            int t = Integer.parseInt(br.readLine());
            boolean[][] ladder = new boolean[SIZE][SIZE];
            int nowY = -1;

            int[] data = null;
            // 윗 부분의 사다리 정보 입력 (마지막 행 제외)
            for (int x = 0; x < SIZE - 1; x++) {
                data = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                for (int y = 0; y < SIZE; y++) {
                    ladder[x][y] = (data[y] == 1);
                }
            }
            // 마지막 행: 1이면 사다리, 0이면 없음, 2면 도착점(출발점을 찾기 위한 표시)
            data = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int y = 0; y < SIZE; y++) {
                ladder[SIZE - 1][y] = (data[y] != 0);
                if (data[y] == 2) {
                    nowY = y;
                }
            }

            // 사다리 탐색 실행
            Solver solver = new Solver(ladder, nowY);
            int result = solver.solve();
            sb.append('#').append(t).append(' ').append(result).append('\n');
        }
        System.out.print(sb.toString());
    }
}
