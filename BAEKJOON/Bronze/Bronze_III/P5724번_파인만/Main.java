package BAEKJOON.Bronze.Bronze_III.P5724번_파인만;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N;
        while ((N = Integer.parseInt(br.readLine())) != 0) {
            int count = 0;
            for (int i = 1; i <= N; i++)
                count += i * i;
            sb.append(count).append('\n');
        }
        System.out.print(sb.toString());
    }
}