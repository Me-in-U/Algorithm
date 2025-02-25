package SWEA.P1486_장훈이의_높은_선반;

/**
 * SW Expert Academy
 * 1486번 장훈이의 높은 선반 D4
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-25
 * JAVA8 : 메모리 26,880 KB, 시간 121ms
 */

import java.io.IOException;

public class Solution_1486_장훈이의높은선반_김민규 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int i = 1; i <= T; i++) {
            // 입력 및 초기화
            int N = readInt();
            int B = readInt();
            int[] h = new int[N];
            for (int j = 0; j < N; j++) {
                h[j] = readInt();
            }
            int result = getMinDifferenceDP(h, B);

            // 출력
            sb.append("#").append(i).append(" ").append(result).append("\n");
        }
        System.out.print(sb.toString());
    }

    /**
     * @param heights 직원들의 높이 배열
     * @param B       목표 탑 높이
     * @return 최소 초과 높이 (조합 합 - B)
     */
    public static int getMinDifferenceDP(int[] heights, int B) {
        // 모든 직원의 높이 합 (DP 배열의 크기를 결정)
        int sumTotal = 0;
        for (int h : heights) {
            sumTotal += h;
        }

        // dp[i] : i 높이 합을 만들 수 있으면 true
        boolean[] dp = new boolean[sumTotal + 1];
        dp[0] = true;

        // 각 직원의 높이를 이용하여 만들 수 있는 합을 갱신
        for (int h : heights) {
            for (int i = sumTotal; i >= h; i--) {
                if (dp[i - h]) {
                    dp[i] = true;
                }
            }
        }

        // B 이상이 되는 합 중 최소값을 찾아 B와의 차이를 반환
        for (int i = B; i <= sumTotal; i++)
            if (dp[i])
                return i - B;

        // 사용하지 않는 return
        return 0;
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
