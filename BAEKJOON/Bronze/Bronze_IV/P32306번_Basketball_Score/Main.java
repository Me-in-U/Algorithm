package BAEKJOON.Bronze.Bronze_IV.P32306번_Basketball_Score;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int team1 = input[0] + (2 * input[1]) + (3 * input[2]);
        input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int team2 = input[0] + (2 * input[1]) + (3 * input[2]);
        int result = 0;
        if (team1 < team2) {
            result = 2;
        } else if (team1 > team2) {
            result = 1;
        }
        System.out.println(result);
    }
}
