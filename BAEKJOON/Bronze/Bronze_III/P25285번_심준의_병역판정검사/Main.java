package BAEKJOON.Bronze.Bronze_III.P25285번_심준의_병역판정검사;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] input = br.readLine().split(" ");
            double cm = Double.parseDouble(input[0]);
            double kg = Double.parseDouble(input[1]);
            double bmi = kg / ((cm / 100.0) * (cm / 100.0));
            if (cm < 140.1) {
                sb.append("6");
            } else if (140.1 <= cm && cm < 146) {
                sb.append("5");
            } else if ((146 <= cm && cm < 159) || (204 <= cm)) {
                sb.append("4");
            } else if (159 <= cm && cm < 161) {
                if (16.0 <= bmi && bmi < 35.0) {
                    sb.append("3");
                } else if ((35.0 <= bmi) || (bmi < 16.0)) {
                    sb.append("4");
                }
            } else if (161 <= cm && cm < 204) {
                if (20.0 <= bmi && bmi < 25.0) {
                    sb.append("1");
                } else if ((18.5 <= bmi && bmi < 20.0) || (25.0 <= bmi && bmi < 30.0)) {
                    sb.append("2");
                } else if ((16.0 <= bmi && bmi < 18.5) || (30.0 <= bmi && bmi < 35.0)) {
                    sb.append("3");
                } else if ((35.0 <= bmi) || (bmi < 16.0)) {
                    sb.append("4");
                }
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}