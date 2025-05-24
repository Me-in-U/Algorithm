package BAEKJOON.Bronze.Bronze_III.P15820번_맞았는데_왜_틀리죠;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int S1 = readInt();
        int S2 = readInt();

        boolean sampleCorrect = true;
        boolean systemCorrect = true;

        for (int i = 0; i < S1; i++) {
            int expected = readInt();
            int actual = readInt();
            if (expected != actual) {
                sampleCorrect = false;
            }
        }

        for (int i = 0; i < S2; i++) {
            int expected = readInt();
            int actual = readInt();
            if (expected != actual) {
                systemCorrect = false;
            }
        }

        if (!sampleCorrect) {
            System.out.print("Wrong Answer");
        } else if (!systemCorrect) {
            System.out.print("Why Wrong!!!");
        } else {
            System.out.print("Accepted");
        }
    }

    private static int readInt() throws IOException {
        int c = System.in.read(), n = 0;
        boolean isNegative = false;
        while (c <= ' ') {
            c = System.in.read();
        }
        if (c == '-') {
            isNegative = true;
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return isNegative ? -n : n;
    }
}
