package BAEKJOON.Bronze.Bronze_III.P32342번_와우와_쿼리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Q = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (Q-- > 0) {
            String S = br.readLine();
            int count = 0;
            for (int i = 0; i + 2 < S.length(); i++) {
                if (S.charAt(i) == 'W' && S.charAt(i + 1) == 'O' && S.charAt(i + 2) == 'W') {
                    count++;
                }
            }
            sb.append(count).append('\n');
        }

        System.out.print(sb);
    }
}
