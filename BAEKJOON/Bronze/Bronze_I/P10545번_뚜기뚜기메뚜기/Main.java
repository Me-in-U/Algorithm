package BAEKJOON.Bronze.Bronze_I.P10545번_뚜기뚜기메뚜기;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    private static int previous = -2;
    private static final int[] ranges = { 'a', 'd', 'g', 'j', 'm', 'p', 't', 'w' };

    public static void main(String[] args) throws IOException {
        StringBuilder result = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] value = new int[10];
        for (int i = 0; i < 9; i++) {
            value[readInt()] = i + 1;
        }
        while (true) {
            int c = System.in.read();
            if ('a' <= c && c <= 'z') {
                result.append(getPushData((char) c, value));
            } else {
                break;
            }
        }
        bw.write(result.toString());
        bw.flush();
    }

    public static String getPushData(char c, int[] value) {
        StringBuilder sb = new StringBuilder();
        int current = getKeypad(c);
        int repeatCount = c - ranges[current - 2] + 1;
        sb.append(String.valueOf(value[current]).repeat(repeatCount));
        if (previous == current) {
            sb.insert(0, "#");
        }
        previous = current;

        return sb.toString();
    }

    private static int getKeypad(char c) {
        if (c <= 'c')
            return 2;
        else if (c <= 'f')
            return 3;
        else if (c <= 'i')
            return 4;
        else if (c <= 'l')
            return 5;
        else if (c <= 'o')
            return 6;
        else if (c <= 's')
            return 7;
        else if (c <= 'v')
            return 8;
        else if (c <= 'z')
            return 9;
        return -1;
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