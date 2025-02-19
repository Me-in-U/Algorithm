package SWEA.P1954번_달팽이_숫자;

import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            int N = readInt();
            int[][] arr = new int[N][N];
            int num = 1;
            int layer = -1;
            int maxNum = N * N;

            while (++layer < N / 2) {
                int point = N - layer - 1;
                // 상단 가로: 왼쪽 -> 오른쪽(point)
                for (int y = layer; y < point; y++)
                    arr[layer][y] = num++;
                // 오른쪽 세로: 위 -> 아래(point)
                for (int x = layer; x < point; x++)
                    arr[x][point] = num++;
                // 하단 가로: 오른쪽(point) -> 왼쪽
                for (int y = point; y > layer; y--)
                    arr[point][y] = num++;
                // 왼쪽 세로: 아래(point) -> 위
                for (int x = point; x > layer; x--)
                    arr[x][layer] = num++;
            }
            // 정중앙
            if (N % 2 == 1)
                arr[layer][layer] = maxNum;
            // 출력
            sb.append("#").append(t).append("\n");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++)
                    sb.append(arr[i][j]).append(' ');
                sb.append('\n');
            }
        }
        System.out.print(sb.toString());
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
