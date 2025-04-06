package BAEKJOON.Bronze.Bronze_I.P3985번_롤_케이크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int[] cake = new int[L];
        int max1 = 0;
        int max2 = 0;
        int first = 0;
        int second = 0;
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int P = Integer.parseInt(input[0]);
            int K = Integer.parseInt(input[1]);
            int count = 0;
            if (max1 < K - P) {
                max1 = K - P;
                first = i + 1;
            }
            for (int j = P - 1; j < K; j++) {
                if (cake[j] == 0) {
                    cake[j] = 1;
                    count++;
                }
            }
            if (max2 < count) {
                max2 = count;
                second = i + 1;
            }
        }
        System.out.println(new StringBuilder().append(first).append('\n').append(second).toString());
    }
}