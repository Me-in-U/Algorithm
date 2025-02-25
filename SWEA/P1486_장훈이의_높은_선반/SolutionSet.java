package SWEA.P1486_장훈이의_높은_선반;

/**
 * SW Expert Academy
 * 1486번 장훈이의 높은 선반 D4
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-25
 * JAVA8 : 메모리 KB, 시간 ms
 */

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class SolutionSet {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int i = 1; i <= T; i++) {
            int N = readInt();
            int B = readInt();
            int[] h = new int[N];
            for (int j = 0; j < N; j++) {
                h[j] = readInt();
            }
            int result = getMinDifference(h, B);
            sb.append("#").append(i).append(" ").append(result).append("\n");
        }
        System.out.print(sb.toString());
    }

    /**
     * 
     * @param heights 직원 키 배열
     * @param B       최소 탑 높이
     * @return int: 높이가 B 이상인 탑 중에서 최소 B와의 차이
     */
    public static int getMinDifference(int[] heights, int B) {
        // 가능한 모든 높이 집합
        Set<Integer> possibleSums = new HashSet<>();
        possibleSums.add(0);

        for (int num : heights) {
            Set<Integer> temp = new HashSet<>();
            for (int sum : possibleSums)
                temp.add(sum + num);
            possibleSums.addAll(temp);
        }

        int minDiff = Integer.MAX_VALUE;
        // 모든 높이의 탑 중에서
        for (int sum : possibleSums) {
            // B이상이면
            if (B <= sum) {
                // B와 차이의 최솟값을 업데이트
                minDiff = Math.min(minDiff, sum - B);
            }
        }
        return minDiff;
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
