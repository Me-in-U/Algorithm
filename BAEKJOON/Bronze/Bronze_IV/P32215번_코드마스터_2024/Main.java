package BAEKJOON.Bronze.Bronze_IV.P32215번_코드마스터_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);
        int sum = m * k + (n - k == 0 ? 0 : m);
        System.out.println(sum);
    }
}