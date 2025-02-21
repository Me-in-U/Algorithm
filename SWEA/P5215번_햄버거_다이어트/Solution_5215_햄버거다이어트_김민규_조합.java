package SWEA.P5215번_햄버거_다이어트;

/**
 * SW Expert Academy
 * 5215번 햄버거 다이어트 D3
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-22
 * JAVA8 : 메모리 25,728 KB, 시간 504ms
 */

import java.io.IOException;

public class Solution_5215_햄버거다이어트_김민규_조합 {
    private static int N;
    private static int L;
    private static int maxScore;
    private static int[][] ingredients;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            // 입력 및 초기화
            N = readInt(); // 재료 개수
            L = readInt(); // 제한 칼로리
            maxScore = 0;
            ingredients = new int[N][2];

            for (int i = 0; i < N; i++) {
                ingredients[i][0] = readInt(); // 맛 점수
                ingredients[i][1] = readInt(); // 칼로리
            }

            // 조합 탐색 (1개부터 N개까지)
            for (int r = 1; r <= N; r++) {
                combination(0, 0, 0, 0, r);
            }

            // 출력
            sb.append('#').append(t).append(' ').append(maxScore).append('\n');
        }
        System.out.print(sb.toString());
    }

    /**
     * 조합을 활용하여 r개의 재료를 선택하는 함수
     * 
     * @param start       현재 시작 인덱스
     * @param depth       현재 선택한 개수
     * @param scoreSum    현재까지의 점수 합
     * @param caloriesSum 현재까지의 칼로리 합
     * @param r           선택해야 할 개수
     */
    private static void combination(int start, int depth, int scoreSum, int caloriesSum, int r) {
        if (depth == r) { // r개를 모두 선택한 경우
            if (caloriesSum <= L) { // 제한 칼로리 이하일 경우 최댓값 갱신
                maxScore = Math.max(maxScore, scoreSum);
            }
            return;
        }

        // 조합 탐색 (start부터 N까지)
        for (int i = start; i < N; i++) {
            combination(i + 1, depth + 1, scoreSum + ingredients[i][0], caloriesSum + ingredients[i][1], r);
        }
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
