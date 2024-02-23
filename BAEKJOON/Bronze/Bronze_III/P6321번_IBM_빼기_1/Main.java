package BAEKJOON.Bronze.Bronze_III.P6321번_IBM_빼기_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append("String #").append(i).append('\n');
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                int c = input.charAt(j) + 1;
                if (c == 'Z' + 1) {
                    c = 'A';
                }
                sb.append((char) c);
            }
            sb.append("\n\n");
        }
        System.out.print(sb.toString().trim());
    }
}