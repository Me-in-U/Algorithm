package SWEA.P2112번_보호필름;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Solution {
    public static int D;
    public static int W;
    public static int K;
    public static int[] binary;
    public static int[] binary_not;

    public static void main(String[] args) throws IOException {
        System.setIn(
                new FileInputStream("C:\\Users\\LoewllZoe\\Documents\\GitHub\\Algorithm\\SWEA\\P2112번_보호필름\\test.txt"));
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int i = 1; i <= T; i++) {
            // 입력 및 초기화
            D = readInt();
            W = readInt();
            K = readInt();
            binary = new int[W];
            binary_not = new int[W];
            for (int shift = 0; shift < D; shift++)
                for (int w = 0; w < W; w++)
                    binary[w] += (readInt() == 1) ? (1 << shift) : 0;
            System.out.println(Arrays.toString(binary));
            for (int w = 0; w < W; w++)
                binary_not[w] = ~binary[w];

            // 풀기
            if (performanceTest(binary, binary_not)) {
                System.out.println("성능검사 통과");
            } else {
                // TODO: 약품 늘리고 temp binary만들고 |= 하고 성능테스트
                // TODO: 조합
                // 최대 D번 약품 주입가능
                for (int d = 1; d < K; d++) {
                    if (combination(d)) {
                        System.out.println("약품 " + d + "번");
                        System.out.println("성능검사 바로 통과");
                        return;
                    }
                }
            }
            System.out.println("최종 K 번");
        }
    }

    public static boolean combination(int selectCount) {
        System.out.println("selectCount = " + selectCount);
        for (int mask = 0; mask < (1 << D); mask++) {
            if (Integer.bitCount(mask) == selectCount) {
                int[] tempBit = new int[W];
                int[] tempBit_not = new int[W];
                for (int w = 0; w < W; w++) {
                    // mask는 1로 바꿈
                    // 0으로 바꾸는 것도 해야함
                    tempBit_not[w] = ~(tempBit[w] = binary[w] | mask);

                }
                if (performanceTest(tempBit, tempBit_not)) {
                    System.out.println("k = " + selectCount + ", mask = " + Integer.toBinaryString(mask));
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean performanceTest(int[] b1, int[] b2) {
        int initMask = (1 << K) - 1;
        for (int w = 0; w < W; w++) {
            boolean valid = false;
            for (int movingMask = initMask; movingMask < (1 << D); movingMask <<= 1) {
                if ((b1[w] & movingMask) == movingMask || (b2[w] & movingMask) == movingMask) {
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

    private static void printBit(int value) {
        System.out.println(String.format("%" + D + "s", Integer.toBinaryString(value)).replace(' ', '0'));
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
