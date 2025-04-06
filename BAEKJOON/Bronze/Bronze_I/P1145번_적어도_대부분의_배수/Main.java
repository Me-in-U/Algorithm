package BAEKJOON.Bronze.Bronze_I.P1145번_적어도_대부분의_배수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = 0;
        int count = 0;
        while (count < 3) {
            result++;
            count = 0;
            for (int i = 0; i < 5; i++)
                if (result % numbers[i] == 0)
                    count++;
        }
        System.out.println(result);
    }
}