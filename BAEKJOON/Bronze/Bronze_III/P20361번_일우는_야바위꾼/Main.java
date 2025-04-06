package BAEKJOON.Bronze.Bronze_III.P20361번_일우는_야바위꾼;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        // 최대 입력 사이즈
        byte[] buffer = new byte[1_500_021];
        System.in.read(buffer);
        int pos = 0;

        int X = 0;
        int K = 0;
        // N 무시
        while (buffer[pos] != ' ') {
            pos++;
        }
        pos++;

        // X 입력
        while (buffer[pos] != ' ') {
            X = X * 10 + (buffer[pos++] - '0');
        }
        pos++;

        // K 입력
        while (buffer[pos] != '\n' && buffer[pos] != '\r') {
            K = K * 10 + (buffer[pos++] - '0');
        }
        pos++;

        // K번 반복
        while (K-- > 0) {
            int A = 0;
            int B = 0;

            // A 입력
            while (buffer[pos] != ' ') {
                A = A * 10 + (buffer[pos++] - '0');
            }
            pos++;

            // B 입력
            while (buffer[pos] != '\n' && buffer[pos] != '\r') {
                B = B * 10 + (buffer[pos++] - '0');
            }
            pos++;

            // 공이 있으면 바꿈
            if (X == A) {
                X = B;
            } else if (X == B) {
                X = A;
            }
        }
        pw.print(X);
        pw.flush();
    }
}