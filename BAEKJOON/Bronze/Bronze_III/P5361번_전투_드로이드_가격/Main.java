package BAEKJOON.Bronze.Bronze_III.P5361번_전투_드로이드_가격;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        double[] price = { 350.34, 230.90, 190.55, 125.30, 180.90 };
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            double total = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++)
                total += price[j] * Integer.parseInt(st.nextToken());
            sb.append('$').append(String.format("%.2f", total)).append('\n');
        }
        System.out.print(sb.toString());
    }
}
