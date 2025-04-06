package BAEKJOON.Bronze.Bronze_III.P24265번_알고리즘_수업_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        System.out.println((n * (n - 1)) / 2);
        System.out.println(2);
    }
}