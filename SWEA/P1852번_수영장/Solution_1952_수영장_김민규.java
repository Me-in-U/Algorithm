package SWEA.P1852번_수영장;

/**
 * <h1>SW Expert Academy 1852번 수영장</h1>
 * <p>
 * JAVA 8 : 메모리 25,472 KB, 시간 82ms <br>
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-04-01
 */

import java.io.IOException;

public class Solution_1952_수영장_김민규 {
    private static int oneDay, oneMonth, threeMonth, min;
    private static int[] plan;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        // 테스트 케이스 수
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            // 입력 및 초기화
            oneDay = readInt();
            oneMonth = readInt();
            threeMonth = readInt();
            min = readInt();// 1년권을 미리 최소값으로
            plan = new int[13];
            for (int i = 1; i < 13; i++) {
                plan[i] = readInt();
            }
            // 계산
            dfs(1, 0);
            // 출력
            sb.append("#").append(t).append(" ").append(min).append("\n");
        }
        System.out.print(sb.toString());
    }

    private static void dfs(int month, int cost) {
        // 최소값 갱신
        if (month > 12) {
            min = Math.min(min, cost);
            return;
        }
        // 해당 월에 수영장 이용 계획이 있을 때
        if (plan[month] > 0) {
            // 3달권 사용
            dfs(month + 3, cost + threeMonth);
            // 1달권 사용
            dfs(month + 1, cost + oneMonth);
            // 1일권 사용
            dfs(month + 1, cost + (plan[month] * oneDay));
        }
        // 해당 월 수영장 이용 계획이 없을 때
        if (plan[month] == 0) {
            dfs(month + 1, cost);
        }
    }

    private static int readInt() throws IOException {
        int c, n = 0;
        while ((c = System.in.read()) > 47)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
