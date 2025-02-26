package SWEA.P4796번_의석이의_우뚝_선_산;

/**
 * SW Expert Academy 4796번 의석이의 우뚝 선 산 D4
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-26 JAVA8 : 메모리 29,440 KB, 시간 234ms
 */

import java.io.IOException;

public class Solution_4796_의석이의_우뚝_선_산_김민규 {
    public static void main(String args[]) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            // 입력 및 초기화
            int N = readInt();
            int[] h = new int[N];
            for (int i = 0; i < N; i++)
                h[i] = readInt();

            int totalCount = 0;
            int i = 0;
            while (i < N - 2) {
                // index i 오른쪽으로 증가구간
                int incrementCount = 0;
                while ((i + 1 < N) && (h[i] < h[i + 1])) {
                    incrementCount++;
                    i++;
                }

                // 증가구간 이후 index i 오른쪽으로 감소구간
                int decrementCount = 0;
                while ((i + 1 < N) && (h[i] > h[i + 1])) {
                    decrementCount++;
                    i++;
                }
                totalCount += incrementCount * decrementCount;
            }

            // 출력
            sb.append("#").append(t).append(" ").append(totalCount).append("\n");
        }
        System.out.print(sb.toString());
    }

    // 빠른 정수 읽기 (불필요한 공백 CR LF tab 제거)
    private static int readInt() throws IOException {
        int c = System.in.read();
        while (c != -1 && (c == ' ' || c == '\n' || c == '\r' || c == '\t')) {
            c = System.in.read();
        }
        int n = 0;
        while (c != -1 && '0' <= c && c <= '9') {
            n = n * 10 + (c - '0');
            c = System.in.read();
        }
        return n;
    }
}