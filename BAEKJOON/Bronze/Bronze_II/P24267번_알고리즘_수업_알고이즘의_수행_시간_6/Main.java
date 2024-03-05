package BAEKJOON.Bronze.Bronze_II.P24267번_알고리즘_수업_알고이즘의_수행_시간_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 1; i <= n - 2; i++)
            for (int j = i + 1; j <= n - 1; j++)
                for (int k = j + 1; k <= n; k++)
                    count++;
        System.out.println(count);
    }
}