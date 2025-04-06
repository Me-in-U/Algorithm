package BAEKJOON.Bronze.Bronze_III.P5789번_한단_안한다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String line = br.readLine();
            int half = line.length() / 2;
            sb.append(line.charAt(half - 1) == line.charAt(half) ? "Do-it" : "Do-it-Not").append('\n');
        }
        System.out.print(sb.toString());
    }
}