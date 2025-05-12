package BAEKJOON.Bronze.Bronze_III.P12756번_고급_여관;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int a = readInt();
        int b = readInt();
        int c = readInt();
        int d = readInt();

        while (true) {
            b -= c;
            d -= a;
            if (b <= 0 || d <= 0) {
                break;
            }
        }

        if (b <= 0 && d <= 0) {
            System.out.println("DRAW");
        } else if (d <= 0) {
            System.out.println("PLAYER A");
        } else {
            System.out.println("PLAYER B");
        }
    }

    private static int readInt() throws IOException {
        int c = System.in.read();
        int n = 0;
        // 공백 문자 건너뛰기
        while (c <= ' ') {
            c = System.in.read();
        }
        // 숫자 파싱
        while (c >= '0' && c <= '9') {
            n = n * 10 + (c - '0');
            c = System.in.read();
        }
        return n;
    }
}
