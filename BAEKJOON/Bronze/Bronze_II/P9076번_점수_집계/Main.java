package BAEKJOON.Bronze.Bronze_II.P9076번_점수_집계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int[] sc = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
            if (sc[3] - sc[1] >= 4) {
                sb.append("KIN");
            } else {
                int sum = 0;
                for (int index = 1; index <= 3; index++) {
                    sum += sc[index];
                }
                sb.append(sum);
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}