package BAEKJOON.Bronze.Bronze_III.P4388번_받아올림;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int a = readInt();
            int b = readInt();
            if (a == 0 && b == 0) {
                break;
            }
            boolean carry = false;
            int count = 0;
            while (a > 0 || b > 0) {
                int sum = a % 10 + b % 10 + (carry ? 1 : 0);
                carry = sum >= 10;
                if (carry) {
                    count++;
                }
                a /= 10;
                b /= 10;
            }
            sb.append(count).append('\n');
        }
        System.out.print(sb.toString());
    }

    private static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
