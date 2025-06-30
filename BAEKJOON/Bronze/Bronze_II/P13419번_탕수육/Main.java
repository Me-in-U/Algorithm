package BAEKJOON.Bronze.Bronze_II.P13419번_탕수육;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String input = br.readLine();
            int length = input.length();
            int gcd = gcd(length, 2);
            int cycleLen = length / gcd;
            StringBuilder first = new StringBuilder(cycleLen);
            for (int k = 0; k < cycleLen; k++) {
                first.append(input.charAt((2 * k) % length));
            }
            StringBuilder second = new StringBuilder(cycleLen);
            for (int k = 0; k < cycleLen; k++) {
                second.append(input.charAt((1 + 2 * k) % length));
            }
            output.append(first).append("\n").append(second).append("\n");
        }
        System.out.print(output);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
