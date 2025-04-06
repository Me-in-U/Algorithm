package BAEKJOON.Bronze.Bronze_III.P9550번_아이들은_사탕을_좋아해;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int attend = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int kind = Integer.parseInt(st.nextToken());
                attend += kind / K;
            }
            sb.append(attend).append('\n');
        }
        System.out.print(sb.toString());
    }
}