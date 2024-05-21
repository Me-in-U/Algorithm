package BAEKJOON.Silver.Silver_IV.P31534번_현대모비스_선풍기_굴리기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int h = Integer.parseInt(input[2]);

        if (a == 0) {
            double r = Math.sqrt(b * b + h * h);
            System.out.println(Math.PI * r * r);
        } else if (a == b) {
            System.out.println(-1);
        } else {
            double total_h = h + (a * h / (1.0 * (b - a)));
            double upper_h = total_h - h;
            double upper_r = Math.sqrt(a * a + upper_h * upper_h);
            double total_r = Math.sqrt(b * b + total_h * total_h);
            System.out.println(Math.PI * (total_r * total_r - upper_r * upper_r));
        }
    }
}
