package SWEA.P2805번_농작물_수확하기;

/**
 * SW Expert Academy 2805번 농작물 수확하기 D3
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-26 JAVA8 : 메모리 25,856 KB, 시간 78ms
 */

import java.io.IOException;

public class Solution_2805_농작물_수확하기_김민규 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            // 입력 및 초기화
            int N = readInt();
            int[][] farm = new int[N][N + 1];
            for (int i = 0; i < N; i++) {
                for (int j = 1; j <= N; j++) {
                    farm[i][j] += (farm[i][j - 1] + (System.in.read() & 15));
                }
                if (System.in.read() == 13)
                    System.in.read();
            }
            int sum = 0;
            int center = (N + 1) >> 1;
            // 맨위, 맨아래에서 중앙으로 가면서 구간합 구하기
            for (int i = 0; i < (N >> 1); i++) {
                sum += (farm[i][center + i] - farm[i][center - i - 1]);
                sum += (farm[N - i - 1][center + i] - farm[N - i - 1][center - i - 1]);
            }
            // 중앙 구간합 더하기
            sum += farm[N >> 1][N];

            // 출력
            sb.append("#").append(t).append(" ").append(sum).append("\n");
        }
        System.out.print(sb.toString());
    }

    // 빠른 정수 읽기
    private static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
