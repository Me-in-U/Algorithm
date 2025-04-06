package BAEKJOON.Bronze.Bronze_III.P16479번_컵하면_측정하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int D1 = Integer.parseInt(st.nextToken());
        int D2 = Integer.parseInt(st.nextToken());
        double result = (K * K) - Math.pow(((Math.min(D1, D2) - Math.max(D1, D2)) / 2.0), 2);
        System.out.println(result);
    }
}