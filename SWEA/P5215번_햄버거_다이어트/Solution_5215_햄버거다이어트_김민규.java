package SWEA.P5215번_햄버거_다이어트;

/**
 * <h1>SW Expert Academy 번</h1>
 * <h1>BAEKJOON 번</h1>
 * <p>
 * JAVA8 : 메모리 KB, 시간 ms <br>
 * JAVA8 : 메모리 KB, 시간 ms
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025--
 */

import java.io.IOException;

public class Solution_5215_햄버거다이어트_김민규 {
    private static int N;
    private static int L;
    private static int maxScore;
    private static int[][] ingredients;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            // 입력 및 초기화
            N = readInt(); // 재료의 수
            L = readInt(); // 제한 칼로리
            maxScore = 0;
            ingredients = new int[N][2];
            for (int i = 0; i < N; i++) {
                ingredients[i][0] = readInt(); // 맛 점수
                ingredients[i][1] = readInt(); // 칼로리
            }

            // 백트래킹 탐색 시작
            findBestBurger(0, 0, 0);

            // 출력
            sb.append('#').append(t).append(' ').append(maxScore).append(' ').append('\n');
        }
        System.out.print(sb.toString());
    }

    /**
     * 현재 재료를 선택하거나 선택하지 않거나 2경우에 대해서 탐색
     * 
     * @param depth       현재 재료 인덱스
     * @param scoreSum    현재 점수 합
     * @param caloriesSum 현재 칼로리 합
     */
    private static void findBestBurger(int depth, int scoreSum, int caloriesSum) {
        // 칼로리 초과 시 탐색 중단 (Pruning)
        if (caloriesSum > L)
            return;

        // 현재 점수 갱신
        maxScore = Math.max(maxScore, scoreSum);

        // 모든 재료를 탐색했으면 종료
        if (depth == N)
            return;

        // 현재 재료를 선택하는 경우
        findBestBurger(depth + 1, scoreSum + ingredients[depth][0], caloriesSum + ingredients[depth][1]);

        // 현재 재료를 선택하지 않는 경우
        findBestBurger(depth + 1, scoreSum, caloriesSum);
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
