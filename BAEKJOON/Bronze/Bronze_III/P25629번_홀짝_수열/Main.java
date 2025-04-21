package BAEKJOON.Bronze.Bronze_III.P25629번_홀짝_수열;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        boolean oddMore = N % 2 == 1;
        int oddCount = 0, evenCount = 0;
        for (int i = 0; i < N; i++) {
            int num = readInt();
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        boolean possible = false;
        if ((oddCount == evenCount) || (oddMore && oddCount == evenCount + 1)) {
            possible = true;
        }
        System.out.print(possible ? "1" : "0");
    }

    private static int readInt() throws IOException {
        int c = System.in.read(), n = 0;
        while (c <= ' ')
            c = System.in.read();
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
