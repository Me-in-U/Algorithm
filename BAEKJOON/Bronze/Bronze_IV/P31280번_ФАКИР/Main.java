package BAEKJOON.Bronze.Bronze_IV.P31280번_ФАКИР;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int sum = 1;
        for (int i = 1; i < input.length; i++) {
            sum += input[i];
        }
        System.out.println(sum);
    }
}