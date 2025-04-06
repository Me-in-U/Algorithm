package BAEKJOON.Silver.Silver_IV.P11508번_2Plus1_세일;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] c = new Integer[N];
        for (int i = 0; i < N; i++) {
            c[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(c, Collections.reverseOrder());
        int minCost = 0;
        for (int i = 0; i < N; i++) {
            if (i % 3 != 2) {
                minCost += c[i];
            }
        }
        System.out.println(minCost);
    }
}
