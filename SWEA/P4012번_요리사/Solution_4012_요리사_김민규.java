package SWEA.P4012번_요리사;

/**
 * SW Expert Academy
 * 4012번 요리사 ?
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-25
 * JAVA8 : 메모리 26,624 KB, 시간 224ms
 */

import java.io.IOException;

public class Solution_4012_요리사_김민규 {
    private static int[][] synergy;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            // 입력 및 초기화
            int N = readInt();
            synergy = new int[N][N];
            for (int i = 0; i < N; i++)
                for (int j = 0; j < N; j++)
                    synergy[i][j] = readInt();

            // 풀기
            int result = solve(N);

            // 출력
            sb.append("#").append(t).append(" ").append(result).append("\n");
        }
        System.out.print(sb.toString());
    }

    /**
     * @param N 전체 재료의 수
     * @return int: 두 음식의 시너지 차이 최솟값
     */
    private static int solve(int N) {
        // 음식당 재료의 수는 전체 재료의 수(N)의 절반
        int ingredients = N >> 1;
        // 음식 A, B의 시너지 차이 최솟값
        int minDifference = Integer.MAX_VALUE;
        // 000...000(2) ~ 111...111(2) 까지
        for (int subset = 0; subset < (1 << N); subset++) {
            // subset의 비트 1의 개수가 재료(N/2)의 수와 같을 때
            if (Integer.bitCount(subset) == ingredients) {
                // 각 음식의 시너지
                int food1 = 0;
                int food2 = 0;
                for (int ingredient1 = 0; ingredient1 < N; ingredient1++) {
                    // 요리1: subset에 해당 비트가 0이면
                    if ((subset & (1 << ingredient1)) == 0) {
                        for (int ingredient2 = 0; ingredient2 < N; ingredient2++)
                            if ((subset & (1 << ingredient2)) == 0)
                                food1 += synergy[ingredient1][ingredient2];
                    } // 요리2: subset에 해당 비트가 1이면
                    else { // ((subset & (1 << ingredient1)) != 0)
                        for (int ingredient2 = 0; ingredient2 < N; ingredient2++)
                            if ((subset & (1 << ingredient2)) != 0)
                                food2 += synergy[ingredient1][ingredient2];
                    }
                }
                minDifference = Math.min(minDifference, Math.abs(food1 - food2));
            }
        }
        return minDifference;
    }

    // 빠른 양수 읽기
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
