package BAEKJOON.Bronze.Bronze_III.P31561번_시계탑;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        double result = 0;
        if (M < 30) {
            result = M / 2.0;
        } else if (M >= 30) {
            result = 15 + ((M - 30) * 3.0 / 2);
        }
        System.out.println(String.format("%.1f", result));
    }
}