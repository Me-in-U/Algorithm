package BAEKJOON.Gold.Gold_I.P11401번_이항_계수_3;

/**
 * <h1>BAEKJOON 11401번 이항 계수 3</h1>
 * <p>
 * JAVA11 : 메모리 44,916KB, 시간 148ms
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-04-15
 */

import java.io.IOException;

public class Main {
    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) throws IOException {
        int N = readInt();
        int K = readInt();

        // 팩토리얼 미리 계산
        long[] factorial = new long[N + 1];
        factorial[0] = 1;
        for (int i = 1; i <= N; i++)
            factorial[i] = (factorial[i - 1] * i) % MOD;

        // 모듈러 역원 계산
        long numerator = factorial[N]; // 분자 N!
        long denominator = (factorial[K] * factorial[N - K]) % MOD; // 분모 (K!*(N-K)!)
        // 분모 모듈러 역원 계산: (K!*(N-K)!)^{-1} mod MOD == (K!*(N-K)!)^{MOD-2} mod MOD
        long denominatorInv = power(denominator, MOD - 2);
        // 결과 계산 (분자 * 분모역원) % MOD
        System.out.print((numerator * denominatorInv) % MOD);
    }

    // 거듭제곱 연산
    private static long power(long base, long exp) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) // 홀수 지수 처리
                result = (result * base) % MOD;
            base = (base * base) % MOD; // 거듭제곱
            exp >>= 1; // 지수 나누기 2
        }
        return result;
    }

    private static int readInt() throws IOException {
        int c = System.in.read(), n = 0;
        while (c <= ' ')
            c = System.in.read();
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}