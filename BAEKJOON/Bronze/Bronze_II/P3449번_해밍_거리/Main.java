package BAEKJOON.Bronze.Bronze_II.P3449번_해밍_거리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            String line1 = br.readLine();
            String line2 = br.readLine();
            int count = 0;
            for (int i = 0; i < line1.length(); i++) {
                if (line1.charAt(i) != line2.charAt(i)) {
                    count++;
                }
            }
            sb.append("Hamming distance is ").append(count).append('.').append('\n');
        }
        System.out.print(sb.toString());
    }
}