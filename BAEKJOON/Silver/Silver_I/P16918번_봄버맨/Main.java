package BAEKJOON.Silver.Silver_I.P16918번_봄버맨;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int R, C, N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        R = Integer.parseInt(input[0]);
        C = Integer.parseInt(input[1]);
        N = Integer.parseInt(input[2]);

        char[][] initial = new char[R][C];
        for (int i = 0; i < R; i++) {
            initial[i] = br.readLine().toCharArray();
        }

        char[][] result;
        if (N == 1) {
            // 초기 상태 그대로 출력
            result = initial;
        } else if (N % 2 == 0) {
            // 짝수 초일 때: 모든 칸이 폭탄
            result = new char[R][C];
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    result[i][j] = 'O';
                }
            }
        } else {
            // N이 홀수(3 이상)인 경우, 4초 주기 패턴
            char[][] grid1 = simulateExplosion(initial); // 시간 3초의 상태
            char[][] grid2 = simulateExplosion(grid1); // 시간 5초의 상태
            // N % 4 == 3 -> 시간 3초 상태, N % 4 == 1 -> 시간 5초 상태
            result = (N % 4 == 3) ? grid1 : grid2;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                sb.append(result[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
    }

    private static char[][] simulateExplosion(char[][] grid) {
        char[][] result = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                result[i][j] = 'O';
            }
        }
        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == 'O') {
                    result[i][j] = '.';
                    for (int d = 0; d < 4; d++) {
                        int nx = i + dx[d];
                        int ny = j + dy[d];
                        if (nx >= 0 && nx < R && ny >= 0 && ny < C) {
                            result[nx][ny] = '.';
                        }
                    }
                }
            }
        }
        return result;
    }
}
