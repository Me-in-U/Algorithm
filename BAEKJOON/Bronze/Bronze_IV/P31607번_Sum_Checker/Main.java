package BAEKJOON.Bronze.Bronze_IV.P31607번_Sum_Checker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++)
            numbers[i] = Integer.parseInt(br.readLine());
        Arrays.sort(numbers);
        System.out.println(numbers[0] + numbers[1] == numbers[2] ? 1 : 0);
    }
}