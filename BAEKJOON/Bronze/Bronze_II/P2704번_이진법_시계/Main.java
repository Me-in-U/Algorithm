package BAEKJOON.Bronze.Bronze_II.P2704번_이진법_시계;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = readInt();
        char[] hBinary = new char[6];
        char[] mBinary = new char[6];
        char[] sBinary = new char[6];
        while (N-- > 0) {
            int H = readInt();
            int M = readInt();
            int S = readInt();
            toBinaryChar(H, hBinary);
            toBinaryChar(M, mBinary);
            toBinaryChar(S, sBinary);
            for (int i = 0; i < 6; i++) {
                bw.write(hBinary[i]);
                bw.write(mBinary[i]);
                bw.write(sBinary[i]);
            }
            bw.write(' ');
            bw.write(hBinary);
            bw.write(mBinary);
            bw.write(sBinary);
            bw.write('\n');
        }
        bw.flush();
    }

    public static int readInt() throws IOException {
        int c;
        int n = 0;
        boolean done = false;
        while ((c = System.in.read()) != -1) {
            if (c >= '0' && c <= '9') {
                done = true;
                n = (n << 3) + (n << 1) + (c & 15);
            } else if (c == ':' || c == '\n' || c == '\r') {
                if (done)
                    break;
            }
        }
        return n;
    }

    private static void toBinaryChar(int num, char[] binary) {
        for (int i = 5; i >= 0; i--) {
            binary[i] = (num & 1) == 1 ? '1' : '0';
            num >>= 1;
        }
    }
}
