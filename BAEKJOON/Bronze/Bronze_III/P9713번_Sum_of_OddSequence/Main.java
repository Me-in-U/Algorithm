package BAEKJOON.Bronze.Bronze_III.P9713번_Sum_of_OddSequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[] sum = new int[101];
        for (int i = 1; i <= 100; i++) {
            sum[i] = sum[i - 1] + (i % 2 != 0 ? i : 0);
        }
        while (T-- > 0) {
            sb.append(sum[Integer.parseInt(br.readLine())]).append('\n');
        }
        System.out.print(sb.toString());
    }
}