package BAEKJOON.Bronze.Bronze_IV.P9699번_RICE_SACK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            sb.append("Case #").append(i).append(": ").append(Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .max()
                    .orElseThrow()).append('\n');
        }
        System.out.print(sb.toString());
    }
}