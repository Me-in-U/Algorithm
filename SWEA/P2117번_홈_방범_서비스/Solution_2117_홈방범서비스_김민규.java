package SWEA.P2117번_홈_방범_서비스;

/**
 * <h1>SW Expert Academy 2117번 홈 방범 서비스</h1>
 * <p>
 * JAVA 8 : 메모리 37,208 KB, 시간 310ms <br>
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-04-02
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution_2117_홈방범서비스_김민규 {
    private static class Home {
        int x, y;

        Home(int x, int y) {
            this.x = x;
            this.y = y;
        }

        /**
         * @param areaCenterX 마름모 중앙 x 좌표
         * @param areaCenterY 마름모 중앙 y 좌표
         * @param k           마름모 중앙으로 부터 떨어진 거리
         * @return
         */
        boolean isInRange(int areaCenterX, int areaCenterY, int k) {
            return Math.abs(areaCenterX - this.x) + Math.abs(areaCenterY - this.y) <= k;
        }
    }

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            // 입력 및 초기화
            List<Home> homes = new ArrayList<>();
            int N = readInt();
            int M = readInt();
            for (int x = 0; x < N; x++)
                for (int y = 0; y < N; y++)
                    if (readInt() == 1)
                        homes.add(new Home(x, y));

            // 손해를 보지 않는 한 운영 가능한 최대한 많은 집 수
            int noLossMaxHomeCount = 0;
            // K가 N+1 일 때, N * N 범위를 다 커버 가능
            for (int k = N + 1; k > 0; k--) {
                // K 일때 운영 비용
                int OPEX = k * k + (k - 1) * (k - 1);
                // 마름모 중간좌표에 대해서 [0, 0]~[N-1, N-1]까지 모두 탐색
                for (int x = 0; x < N; x++) {
                    for (int y = 0; y < N; y++) {
                        // 마름모 범위 내에 있는 집 세기
                        int homeCount = 0;
                        for (Home home : homes)
                            if (home.isInRange(x, y, k - 1))
                                homeCount++;
                        // 보안회사 이익 계산
                        int revenue = homeCount * M;
                        if (revenue >= OPEX)
                            noLossMaxHomeCount = Math.max(noLossMaxHomeCount, homeCount);
                    }
                }
            }
            sb.append("#").append(t).append(" ").append(noLossMaxHomeCount).append("\n");
        }
        System.out.print(sb.toString());
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
