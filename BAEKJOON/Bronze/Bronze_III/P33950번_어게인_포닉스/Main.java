package BAEKJOON.Bronze.Bronze_III.P33950번_어게인_포닉스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            String str = br.readLine();
            sb.append(str.replace("PO", "PHO")).append('\n');
        }
        System.out.print(sb);
    }
}