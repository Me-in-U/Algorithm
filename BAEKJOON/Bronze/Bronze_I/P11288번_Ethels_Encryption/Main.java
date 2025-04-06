package BAEKJOON.Bronze.Bronze_I.P11288번_Ethels_Encryption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        long a = Long.parseLong(input[1]);
        long b = Long.parseLong(input[2]);
        int offset = sq(a, b, 26);
        StringBuilder sb = new StringBuilder();
        String message = br.readLine();
        for (int i = 0; i < n; i++) {
            char c = message.charAt(i);
            if ('A' <= c && c <= 'Z') {
                char shifted = (char) (c - offset);
                if (shifted < 'A') {
                    shifted += 26;
                }
                sb.append(shifted);
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }

    public static int sq(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return (int) result;
    }
}