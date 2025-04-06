package BAEKJOON.Bronze.Bronze_I.P2684번_동전_게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int P = Integer.parseInt(br.readLine());
        while (P-- > 0) {
            int[] counts = new int[8];
            String s = br.readLine();
            for (int i = 0; i < 38; i++) {
                int index = 0;
                if (s.charAt(i) == 'H')
                    index |= 4;
                if (s.charAt(i + 1) == 'H')
                    index |= 2;
                if (s.charAt(i + 2) == 'H')
                    index |= 1;
                counts[index]++;
            }
            for (int count : counts) {
                sb.append(count).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb.toString().trim());
    }
}