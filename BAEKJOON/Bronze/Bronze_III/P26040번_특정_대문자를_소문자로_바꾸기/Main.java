package BAEKJOON.Bronze.Bronze_III.P26040번_특정_대문자를_소문자로_바꾸기;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = 0;
        char[] A = new char[100_002];
        int pos = 0;
        while ((c = System.in.read()) != -1) {
            if (('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z')) {
                A[pos++] = (char) c;
            }
            if (c == '\r' || c == '\n') {
                if (c == '\r')
                    System.in.read();
                break;
            }
        }
        boolean[] B = new boolean[26];
        while ((c = System.in.read()) != -1) {
            if ('A' <= c && c <= 'Z') {
                B[c - 'A'] = true;
            }
            if (c == '\r' || c == '\n') {
                break;
            }
        }
        for (int i = 0; i < pos; i++) {
            if ('A' <= A[i] && A[i] <= 'Z' && B[A[i] - 'A']) {
                A[i] = (char) (A[i] + 32);
            }
        }
        bw.write(A, 0, pos);
        bw.flush();
    }
}