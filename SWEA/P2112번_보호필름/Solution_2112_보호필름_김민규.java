package SWEA.P2112번_보호필름;

/**
 * SW Expert Academy 2112번 보호 필름 ?
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-27 JAVA8 : 메모리 93,772 KB, 시간 500ms 최적화 안됨
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Solution_2112_보호필름_김민규 {
    public static int D;
    public static int W;
    public static int K;
    public static int[] originalBit;
    public static int[] originalBit_Not;
    public static int mask;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream(
                "C:\\Users\\SSAFY\\Documents\\GitHub\\Algorithm\\SWEA\\P2112번_보호필름\\sample_input.txt"));
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            // 입력 및 초기화
            D = readInt(); // 두께
            W = readInt(); // 가로(셀)크기
            K = readInt(); // 성능 검사 기준 (연속 K개)
            mask = (1 << D) - 1; // D개의 하위 비트만 1로 채움

            // 비트 변환시
            originalBit = new int[W]; // 0(A) 1(B)
            for (int shift = 0; shift < D; shift++)
                for (int w = 0; w < W; w++)
                    originalBit[w] |= (readInt() == 1) ? (1 << shift) : 0;

            // 약품 투여 없이 성능 테스트 통과하는 경우
            boolean found = performanceTest(originalBit);
            int result = 0;
            if (!found) {
                // 1 ~ (K-1)번 약품 투여하는 조합 검사
                for (int cnt = 1; cnt < K; cnt++) {
                    if (combination(cnt)) {
                        found = true;
                        result = cnt;
                        break;
                    }
                }
            }
            sb.append("#").append(t).append(" ").append(found ? result : K).append('\n');
        }
        System.out.print(sb.toString());
    }

    // 선택된 count개의 행에 대해 약품 투여 조합 검사
    private static boolean combination(int selectCount) {
        return dfs(0, 0, new int[selectCount], selectCount);
    }

    private static boolean dfs(int depth, int start, int[] selected, int selectCount) {
        if (depth == selectCount) {
            return applyChemical(selected, selectCount);
        }
        for (int i = start; i < D; i++) {
            selected[depth] = i;
            if (dfs(depth + 1, i + 1, selected, selectCount))
                return true;
        }
        return false;
    }

    // 선택된 행들(selected[0..selectCount-1])에 대해 약품 A(0) 또는 B(1)을 적용한 모든 경우를 시뮬레이션
    private static boolean applyChemical(int[] selected, int selectCount) {
        int totalCases = 1 << selectCount; // 각 선택 행에 대해 A(0) 또는 B(1) 선택
        for (int caseMask = 0; caseMask < totalCases; caseMask++) {
            // temp 배열 복사: 원본을 변경하지 않도록 함
            int[] tempBit = Arrays.copyOf(originalBit, W);
            // 각 선택된 행에 대해 약품 투여 적용
            for (int i = 0; i < selectCount; i++) {
                int row = selected[i];
                int applyType = (caseMask >> i) & 1; // 0: A, 1: B
                for (int w = 0; w < W; w++) {
                    if (applyType == 0) {
                        // 전체를 A (0)로 설정: 해당 비트를 0으로 만듦
                        tempBit[w] &= ~(1 << row);
                    } else {
                        // 전체를 B (1)로 설정: 해당 비트를 1로 만듦
                        tempBit[w] |= (1 << row);
                    }
                }
            }
            if (performanceTest(tempBit)) {
                return true;
            }
        }
        return false;
    }

    // 성능 테스트: 각 열(tempBinary[w])에서 연속된 동일 특성 셀이 K개 이상 존재하는지 검사
    private static boolean performanceTest(int[] film) {
        int initMask = (1 << K) - 1;
        for (int w = 0; w < W; w++) {
            boolean valid = false;
            // film의 해당 열에서 연속된 K개의 비트가 모두 0 || 1인지 확인
            for (int movingMask = initMask; movingMask < (1 << D); movingMask <<= 1) {
                // ------------------------------------------XOR 연산과 mask(full 1 bit)으로 비트 반전
                if ((film[w] & movingMask) == movingMask || (((film[w] ^ mask) & movingMask) == movingMask)) {
                    valid = true;
                    break;
                }
            }
            if (!valid) {
                return false;
            }
        }
        return true;
    }

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
