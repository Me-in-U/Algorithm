package BAEKJOON.Bronze.Bronze_II.P1864번_문어_숫자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            if (line.equals("#")) {
                break;
            }
            long result = 0;
            for (int i = 0; i < line.length(); i++) {
                int digit = octopusDigit(line.charAt(i));
                result = result * 8 + digit;
            }
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }

    private static int octopusDigit(char c) {
        switch (c) {
        case '-':
            return 0;
        case '\\':
            return 1;
        case '(':
            return 2;
        case '@':
            return 3;
        case '?':
            return 4;
        case '>':
            return 5;
        case '&':
            return 6;
        case '%':
            return 7;
        case '/':
            return -1;
        default:
            return -1;
        }
    }
}
