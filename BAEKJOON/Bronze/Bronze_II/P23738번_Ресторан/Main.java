package BAEKJOON.Bronze.Bronze_II.P23738번_Ресторан;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] arr = br.readLine().toCharArray();
        for (char c : arr) {
            if (c == 'B') {
                sb.append('v');
            } else if (c == 'E') {
                sb.append("ye");
            } else if (c == 'H') {
                sb.append('n');
            } else if (c == 'P') {
                sb.append('r');
            } else if (c == 'C') {
                sb.append('s');
            } else if (c == 'Y') {
                sb.append('u');
            } else if (c == 'X') {
                sb.append('h');
            } else if (c == 'A') {
                sb.append('a');
            } else if (c == 'K') {
                sb.append('k');
            } else if (c == 'M') {
                sb.append('m');
            } else if (c == 'O') {
                sb.append('o');
            } else if (c == 'T') {
                sb.append('t');
            }
        }
        System.out.println(sb.toString());
    }
}
