package BAEKJOON.Bronze.Bronze_IV.P30868번_개표;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int five = n / 5;
            int left = n % 5;
            for (int j = 0; j < five; j++) {
                sb.append("++++ ");
            }
            for (int j = 0; j < left; j++) {
                sb.append('|');
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}