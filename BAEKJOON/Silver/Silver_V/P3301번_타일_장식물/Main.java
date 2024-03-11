package BAEKJOON.Silver.Silver_V.P3301번_타일_장식물;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] DRUL = { 1L, 1L, 1L, 1L };
        int N = Integer.parseInt(br.readLine());
        int edge = 1;
        while (edge < N) {
            for (int j = 0; j < 4 && edge < N; edge++, j++) {
                long increment = DRUL[j];
                if (j == 0 || j == 2) {
                    DRUL[1] += increment;
                    DRUL[3] += increment;
                } else {
                    DRUL[0] += increment;
                    DRUL[2] += increment;
                }
            }
        }
        System.out.println(DRUL[0] + DRUL[1] + DRUL[2] + DRUL[3]);
    }
}