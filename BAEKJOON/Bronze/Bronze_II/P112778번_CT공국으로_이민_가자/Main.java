package BAEKJOON.Bronze.Bronze_II.P112778번_CT공국으로_이민_가자;

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
            if (input[1].charAt(0) == 'C') {
                input = br.readLine().split(" ");
                for (String string : input) {
                    sb.append(string.charAt(0) - 'A' + 1).append(' ');
                }
            } else {
                input = br.readLine().split(" ");
                for (String string : input) {
                    sb.append((char) (Integer.valueOf(string) + 'A' - 1)).append(' ');
                }
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}