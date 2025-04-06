package BAEKJOON.Bronze.Bronze_III.P16483번_접시_안의_원;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int c;
        int T = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            T = (T * 10) + (c & 15);
        int result = (int) Math.round(T * T / 4.0);
        System.out.print(result);
    }
}
