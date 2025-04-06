package BAEKJOON.Bronze.Bronze_IV.P33162번_Walking;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int x = readInt();
        int meter = x / 2 + (x % 2 == 1 ? 3 : 0);
        System.out.println(meter);
    }

    public static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}