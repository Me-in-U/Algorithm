package SWEA.P2112번_보호필름;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Solution {
    public static int[] binary;
    public static int[] binary_not;
    public static int D;
    public static int W;
    public static int K;

    public static void main(String[] args) throws IOException {
        System.setIn(
                new FileInputStream("C:\\Users\\SSAFY\\Documents\\GitHub\\Algorithm\\SWEA\\P2112번_보호필름\\test.txt"));
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int i = 1; i <= T; i++) {
            // 입력 및 초기화
            D = readInt();
            W = readInt();
            K = readInt();
            binary = new int[W];
            binary_not = new int[W];
            // TODO : 바이너리 입력 수정
            for (int shift = 0; shift < D; shift++)
                for (int w = 0; w < W; w++)
                    binary[w] += readInt() == 1 ? (1 << shift) : 0;
            System.out.println(Arrays.toString(binary));
            for (int w = 0; w < W; w++)
                binary_not[w] = ~binary[w];

            // 풀기
            if (performanceTest()) {
                System.out.println("성능검사 통과");
            } else {
                // TODO: 약품 늘리고 temp binary만들고 |= 하고 성능테스트
                // TODO: 조합
            }

        }
    }

    private static boolean performanceTest() {
        int initMask = (1 << K) - 1;
        for (int w = 0; w < W; w++) {
            boolean valid = false;
            for (int movingMask = initMask; movingMask < (1 << W); movingMask <<= 1) {
                if ((binary[w] & movingMask) == movingMask) {
                    valid = true;
                    break;
                }
                if ((binary_not[w] & movingMask) == movingMask) {
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
