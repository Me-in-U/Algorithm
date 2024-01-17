package BAEKJOON.Bronze.Bronze_III.P14920번_3n;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        if (N != 1) {
            int TN = 0;
            while (true) {
                if (TN == 1)
                    break;
                if (N % 2 == 0)
                    TN = N / 2;
                else
                    TN = (3 * N) + 1;
                N = TN;
                count++;
            }
        }
        System.out.println(count);
    }
}