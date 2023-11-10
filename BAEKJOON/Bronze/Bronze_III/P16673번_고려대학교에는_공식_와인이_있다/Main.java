package BAEKJOON.Bronze.Bronze_III.P16673번_고려대학교에는_공식_와인이_있다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int count = 0;
        for (int i = 1; i <= C; i++) {
            count += (K * i) + (P * i * i);
        }
        System.out.println(count);
    }
}