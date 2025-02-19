package SWEA.P1210_Ladder1;

/**
 * SWEA
 * 1210. [S/W 문제해결 기본] 2일차 - Ladder1
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-19
 * 메모리  - 43,096 kb
 * 실행시간- 196 ms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    static class Solver {
        // 사다리 배열 true : 통로가 있음, false : 통로가 없음
        private boolean[][] ladder;
        // 현재 위치
        private int nowX;
        private int nowY;

        public Solver(boolean[][] ladder, int nowY) {
            this.ladder = ladder;
            this.nowX = SIZE - 1;
            this.nowY = nowY;
        }

        /**
         * @return nowY 최상단 도착시 y값(문제에서는 X값)
         */
        public int solve() {
            // 최상단(0행)에 도달할 때까지 탐색
            while (nowX > 0) {
                // 왼쪽으로 움직일 수 있으면 끝까지 이동
                if (canMoveLeft()) {
                    while (canMoveLeft()) {
                        nowY--;
                    }
                    nowX--;
                } // 오른쪽으로 움직일 수 있으면 끝까지 이동
                else if (canMoveRight()) {
                    while (canMoveRight()) {
                        nowY++;
                    }
                    nowX--;
                } // 옆으로 못 움직이면 위로 한 칸 이동
                else {
                    nowX--;
                }
            }
            return nowY;
        }

        /**
         * @return if true, then 왼쪽으로 움직 일 수 있음
         * @return if false, then 왼쪽으로 움직 일 수 없음
         */
        private boolean canMoveLeft() {
            return (nowY - 1 >= 0 && ladder[nowX][nowY - 1]);
        }

        /**
         * @return if true, then 오른쪽으로 움직 일 수 있음
         * @return if false, then 오른쪽으로 움직 일 수 없음
         */
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
