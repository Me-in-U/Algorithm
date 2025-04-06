package BAEKJOON.Bronze.Bronze_III.P15633번_Fan_Death;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += n % i == 0 ? i : 0;
        }
        System.out.println((sum * 5) - 24);
    }
}