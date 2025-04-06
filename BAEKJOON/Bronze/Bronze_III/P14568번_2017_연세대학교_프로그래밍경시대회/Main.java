package BAEKJOON.Bronze.Bronze_III.P14568번_2017_연세대학교_프로그래밍경시대회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int a = 1; a < N + 1; a++)
            for (int b = 1; b < N + 1; b++)
                for (int c = 1; c < N + 1; c++)
                    if (((a + b + c) == N) && ((b + 2) <= a) && ((c % 2) == 0))
                        count++;
        System.out.println(count);
    }
}