package BAEKJOON.Bronze.Bronze_IV.P30791번_gahui_and_sousenkyo_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = 0;
        for (int i = 1; i < 5; i++)
            if (input[0] - input[i] <= 1000)
                count++;
        System.out.println(count);
    }
}