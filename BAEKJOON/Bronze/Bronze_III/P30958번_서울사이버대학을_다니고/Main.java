package BAEKJOON.Bronze.Bronze_III.P30958번_서울사이버대학을_다니고;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = readInt();
        int[] count = new int[256];
        for (int i = 0; i < N; i++) {
            count[System.in.read()]++;
        }
        int max = 0;
        for (int i = 0; i < 256; i++) {
            if (max < count[i]) {
                if (i != ' ' && i != ',' && i != '.') {
                    max = count[i];
                }
            }
        }
        bw.write(String.valueOf(max));
        bw.flush();
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