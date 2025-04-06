package BAEKJOON.Bronze.Bronze_III.P10214번_Baseball;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int Yonsei = 0;
            int Korea = 0;
            for (int j = 0; j < 9; j++) {
                st = new StringTokenizer(br.readLine());
                Yonsei += Integer.parseInt(st.nextToken());
                Korea += Integer.parseInt(st.nextToken());
            }
            if (Yonsei > Korea)
                sb.append("Yonsei").append('\n');
            else if (Yonsei < Korea)
                sb.append("Korea").append('\n');
            else
                sb.append("Draw").append('\n');
        }
        System.out.print(sb.toString());
    }
}