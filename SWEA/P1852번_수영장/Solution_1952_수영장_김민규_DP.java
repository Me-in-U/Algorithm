package SWEA.P1852번_수영장;

/**
 * <h1>SW Expert Academy 1852번 수영장</h1>
 * <p>
 * JAVA 8 : 메모리 22,144 KB, 시간 74ms <br>
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-04-01
 */

import java.io.IOException;

public class Solution_1952_수영장_김민규_DP {
    private static int oneDay, oneMonth, threeMonth, oneYear;
    private static int[] plan;
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        // 테스트 케이스 수
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            // 입력 및 초기화
            oneDay = readInt();
            oneMonth = readInt();
            threeMonth = readInt();
            oneYear = readInt();
            plan = new int[13];
            for (int i = 1; i < 13; i++) {
                plan[i] = readInt();
            }
            dp = new int[13];
            for (int month = 1; month <= 12; month++) {
                // 1일 1달 계산
                dp[month] = dp[month - 1] + Math.min(plan[month] * oneDay, oneMonth);
                // 3달 계산
                if (month >= 3) {
                    dp[month] = Math.min(dp[month], dp[month - 3] + threeMonth);
                }
            }
            // 출력
            sb.append("#").append(t).append(" ").append(Math.min(oneYear, dp[12])).append("\n");
        }
        System.out.print(sb.toString());
    }

    private static int readInt() throws IOException {
        int c, n = 0;
        while ((c = System.in.read()) > 47)
            n = (n * 10) + (c & 15);
        return n;
    }
}
