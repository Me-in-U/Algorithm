package BAEKJOON.Bronze.Bronze_II.P17011번_Cold_Compress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String input = br.readLine();
            int count = 1;
            char c = input.charAt(0);
            for (int i = 1; i < input.length(); i++) {
                char temp = input.charAt(i);
                if (c == temp) {
                    count++;
                } else {
                    sb.append(count).append(" ").append(c).append(" ");
                    c = temp;
                    count = 1;
                }
            }
            sb.append(count).append(" ").append(c).append(" ").append("\n");
        }
        System.out.print(sb.toString());
    }
}