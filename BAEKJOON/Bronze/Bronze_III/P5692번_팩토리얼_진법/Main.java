package BAEKJOON.Bronze.Bronze_III.P5692번_팩토리얼_진법;

import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int a = readInt();
            if (a == 0)
                break;
            int count = 1;
            int num = 1;
            int sum = 0;
            while (a > 0) {
                int n = a % 10;
                sum += n * num;
                a /= 10;
                num *= ++count;
            }
            sb.append(sum).append('\n');
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
