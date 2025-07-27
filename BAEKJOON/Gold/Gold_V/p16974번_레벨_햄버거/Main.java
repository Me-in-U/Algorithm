package BAEKJOON.Gold.Gold_V.p16974번_레벨_햄버거;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static long[] level, patties;

    // 레벨-L 햄버거에서 아래에서부터 x장의 층을 먹었을 때
    // 먹은 패티의 개수를 반환
    private static long eat(int L, long x) {
        // 레벨-0 버거는 패티 한 장
        if (L == 0) {
            return x <= 0 ? 0 : 1;
        }
        // 첫 번째는 번이라서 패티가 없음
        if (x == 1) {
            return 0;
        }
        // 첫 번째 번 + 첫 번째 서브버거 일부
        // 번 + sub1 일부
        if (x <= (1 + level[L - 1])) {
            return eat(L - 1, x - 1); // x - 1 (번 1장 제외)
        }
        // 중앙 패티까지 딱 먹었을 때
        // 번 + sub1 + 패티
        if (x == (1 + level[L - 1] + 1)) {
            return patties[L - 1] + 1;
        }
        // 중앙 패티 + 두 번째 서브버거 일부
        // 번 + sub1 + 패티 + sub2 일부
        if (x <= (1 + level[L - 1] + 1 + level[L - 1])) {
            // 서브1 패티 + 중앙 패티 + 서브2를 다시 재귀 계산
            long eatenInSub2 = eat(L - 1, x - (1 + level[L - 1] + 1)); // x - (번 1장 + sub1 전체 + 중앙 패티 1장 제외)
            return patties[L - 1] + 1 + eatenInSub2;
        }
        // 버거 전체
        return patties[L];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        long X = Long.parseLong(input[1]);

        level = new long[N + 1];
        patties = new long[N + 1];

        // 레벨-0 초기화
        level[0] = 1;
        patties[0] = 1;

        for (int i = 1; i <= N; i++) {
            // 번(1개)
            // 레벨-(i-1) 버거 층 수
            // 중앙 패티(1개)
            // 레벨-(i-1) 버거 층 수
            // 번(1개)
            level[i] = level[i - 1] * 2 + 3;
            // 레벨-(i-1) 버거의 패티 수
            // 중앙 패티(1개)
            // 레벨-(i-1) 버거의 패티 수
            patties[i] = patties[i - 1] * 2 + 1;
        }

        // 출력
        System.out.println(eat(N, X));
    }
}
