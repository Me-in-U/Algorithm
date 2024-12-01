package P20361번_일우는_야바위꾼;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(System.in);
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        byte[] buffer = new byte[1400021];
        int len = bis.read(buffer);
        int pos = 0;

        int X = 0;
        int K = 0;
        while (buffer[pos] != ' ') {
            pos++;
        }
        pos++;
        while (buffer[pos] != ' ') {
            X = X * 10 + (buffer[pos++] - '0');
        }
        pos++;
        while (buffer[pos] != '\n' && buffer[pos] != '\r') {
            K = K * 10 + (buffer[pos++] - '0');
        }
        pos++;
        while (K-- > 0) {
            int A = 0;
            int B = 0;
            while (pos < len && buffer[pos] != ' ') {
                A = A * 10 + (buffer[pos++] - '0');
            }
            pos++;
            while (pos < len && buffer[pos] != '\n' && buffer[pos] != '\r') {
                B = B * 10 + (buffer[pos++] - '0');
            }
            pos++;

            if (X == A) {
                X = B;
            } else if (X == B) {
                X = A;
            }
        }
        pw.println(X);
        pw.flush();
    }
}