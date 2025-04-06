package BAEKJOON.Bronze.Bronze_III.P5691번_평균_중앙값_문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (input[0] == 0 && input[1] == 0) {
                break;
            }
            sb.append(input[0] + input[0] - input[1]).append('\n');
        }
        System.out.print(sb.toString());
    }
}