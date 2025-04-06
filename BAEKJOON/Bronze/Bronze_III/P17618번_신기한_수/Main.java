package BAEKJOON.Bronze.Bronze_III.P17618번_신기한_수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int d = i;
            while (d != 0) {
                sum += d % 10;
                d /= 10;
            }
            if (i % sum == 0)
                count++;
        }
        System.out.println(count);
    }
}