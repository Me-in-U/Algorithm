package BAEKJOON.Bronze.Bronze_IV.P26560번_Periods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            sb.append(line).append(line.charAt(line.length() - 1) == '.' ? '\n' : ".\n");
        }
        System.out.print(sb.toString());
    }
}
