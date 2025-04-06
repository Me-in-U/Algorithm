package BAEKJOON.Bronze.Bronze_III.P32209번_다음_달에_봐요;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Q = Integer.parseInt(br.readLine());
        boolean isAdios = false;
        int problemCount = 0;
        while (Q-- > 0) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (input[0] == 1) {
                problemCount += input[1];
            } else {
                if (problemCount < input[1]) {
                    isAdios = true;
                }
                problemCount -= input[1];
            }
        }
        System.out.println(isAdios ? "Adios" : "See you next month");
    }
}