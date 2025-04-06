package BAEKJOON.Bronze.Bronze_II.P5218번_알파벳_거리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            sb.append("Distances: ");
            String[] input = br.readLine().split(" ");
            for (int i = 0; i < input[0].length(); i++) {
                int x = input[0].charAt(i);
                int y = input[1].charAt(i);
                sb.append(y >= x ? y - x : y + 26 - x).append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}