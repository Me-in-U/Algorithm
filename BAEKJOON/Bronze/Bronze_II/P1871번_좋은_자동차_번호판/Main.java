package BAEKJOON.Bronze.Bronze_II.P1871번_좋은_자동차_번호판;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    protected static final int[] ts = { 676, 26, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String line = br.readLine();
            int value = 0;
            for (int i = 0; i < 3; i++) {
                value += (line.charAt(i) - 'A') * ts[i];
            }
            int num = Math.abs(value - Integer.parseInt(line.substring(4, line.length())));
            sb.append(num <= 100 ? "nice" : "not nice").append('\n');
        }
        System.out.print(sb.toString());
    }
}