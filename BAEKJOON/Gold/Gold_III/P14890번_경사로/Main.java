package BAEKJOON.Gold.Gold_III.P14890번_경사로;

import java.io.IOException;

public class Main {
    private static int N, X;
    private static int[][] map;

    public static void main(String[] args) throws IOException {
        // 입력 및 초기화
        N = readInt();
        X = readInt();
        map = new int[N][N];
        int count = 0;
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                map[i][j] = readInt();
        // solve
        for (int i = 0; i < N; i++) {
            if (checkRow(i)) // 가로
                count++;
            if (checkCol(i)) // 세로
                count++;
        }
        System.out.print(count);
    }

    private static boolean checkRow(int row) {
        int previous = map[row][0];
        boolean[] visited = new boolean[N]; // 경사로 겹침 방지
        for (int y = 1; y < N; y++) {
            if (previous == map[row][y]) { // 평지 ―――
                continue;
            } else if (previous + 1 == map[row][y]) { // 오르막 __↗￣
                // 왼쪽으로 X 길이의 경사로를 놓을 수 있는지 확인
                for (int k = 1; k <= X; k++) {
                    if ((y - k < 0) || visited[y - k] || (previous != map[row][y - k]))
                        return false;
                    visited[y - k] = true;
                }
            } else if (previous - 1 == map[row][y]) { // 내리막 ￣↘__
                // 오른쪽으로 X 길이의 경사로를 놓을 수 있는지 확인
                for (int k = 0; k < X; k++) {
                    if ((N <= y + k) || visited[y + k] || (map[row][y] != map[row][y + k]))
                        return false;
                    visited[y + k] = true;
                }
            } else { // 차이 1 초과 경사
                return false;
            }
            previous = map[row][y];
        }
        return true;
    }

    private static boolean checkCol(int col) {
        int previous = map[0][col];
        boolean[] visited = new boolean[N]; // 경사로 겹침 방지
        for (int y = 1; y < N; y++) {
            if (previous == map[y][col]) { // 평지 ―――
                continue;
            } else if (previous + 1 == map[y][col]) { // 오르막 __↗￣
                // 왼쪽으로 X 길이의 경사로를 놓을 수 있는지 확인
                for (int k = 1; k <= X; k++) {
                    if ((y - k < 0) || visited[y - k] || (previous != map[y - k][col]))
                        return false;
                    visited[y - k] = true;
                }
            } else if (previous - 1 == map[y][col]) { // 내리막 ￣↘__
                // 오른쪽으로 X 길이의 경사로를 놓을 수 있는지 확인
                for (int k = 0; k < X; k++) {
                    if ((N <= y + k) || visited[y + k] || (map[y][col] != map[y + k][col]))
                        return false;
                    visited[y + k] = true;
                }
            } else { // 차이 1 초과 경사
                return false;
            }
            previous = map[y][col];
        }
        return true;
    }

    private static int readInt() throws IOException {
        int c, n = 0;
        c = System.in.read();
        while (c <= ' ') {
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
