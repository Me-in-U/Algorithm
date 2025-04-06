package BAEKJOON.Bronze.Bronze_III.P23348번_스트릿_코딩_파이터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] techScore = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = 0;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                String[] input = br.readLine().split(" ");
                sum += (techScore[0] * Integer.parseInt(input[0])) + (techScore[1] * Integer.parseInt(input[1]))
                        + (techScore[2] * Integer.parseInt(input[2]));
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}