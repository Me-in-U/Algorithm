package SWEA.P3421번_수제버거_장인;

/**
 * SW Expert Academy
 * 3421번 수제 버거 장인 D5
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-22
 * JAVA8 : 메모리 66,304KB, 시간 419ms
 */

import java.io.IOException;

public class Solution_3421_수제버거장인_김민규_객체 {
    private static boolean[][] discord;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        // T번 반복
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            // 데이터 입력 및 초기화
            int N = readInt();
            int M = readInt();

            // 서로 어울리지 않는 재료 저장 배열
            discord = new boolean[N][N];
            while (M-- > 0) {
                // 인덱스 탐색을 위해 -1
                int a = readInt() - 1;
                int b = readInt() - 1;
                // 아래 조건을 만족하기 위해 양뱡향 그래프
                // 주어지는 쌍들은 모두 다르지는 않고, 즉 같은 쌍이 여러 번 주어질 수도 있다.
                discord[a][b] = true;
                discord[b][a] = true;
            }

            int validCount = 0;
            // 000...000(2) ~ 111...111(2) -> (1 << N) 까지 부분 집합
            for (int mask = 0; mask < (1 << N); mask++)
                if (isValid(mask, N))
                    validCount++;

            // 출력
            sb.append('#').append(t).append(' ').append(validCount).append('\n');
        }
        System.out.print(sb.toString());
    }

    /**
     * 
     * @param mask 현재 선택된 재료들의 비트마스크
     * @param N    재료 개수
     * @return boolean: 선택된 재료가 유효한 조합인지 여부
     */
    private static boolean isValid(int mask, int N) {
        // 첫번째 재료 선택
        for (int i = 0; i < N; i++) {
            // i번째 재료가 선택되었을 때
            if ((mask & (1 << i)) != 0) {
                // 두번째 재료선택
                for (int j = i + 1; j < N; j++) {
                    // 첫번째(i)와 두번째(j)로 선택된 재료와 어울리지 않으면 false
                    if (discord[i][j] && (mask & (1 << j)) != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    // 빠른 정수 읽기
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
