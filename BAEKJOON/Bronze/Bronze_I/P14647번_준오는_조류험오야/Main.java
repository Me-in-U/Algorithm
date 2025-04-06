package BAEKJOON.Bronze.Bronze_I.P14647번_준오는_조류험오야;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] rowDigitNineCounts = new int[n];
        int[] colDigitNineCounts = new int[m];
        for (int r = 0; r < n; r++) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < m; c++) {
                int value = Integer.parseInt(st.nextToken());
                while (value > 0) {
                    if (value % 10 == 9) {
                        rowDigitNineCounts[r]++;
                        colDigitNineCounts[c]++;
                    }
                    value /= 10;
                }
            }
        }
        int total = 0;
        int maxNines = Integer.MIN_VALUE;
        for (int r = 0; r < n; r++) {
            total += rowDigitNineCounts[r];
            maxNines = Math.max(maxNines, rowDigitNineCounts[r]);
        }
        for (int c = 0; c < m; c++) {
            maxNines = Math.max(maxNines, colDigitNineCounts[c]);
        }
        System.out.println(total - maxNines);
    }
}