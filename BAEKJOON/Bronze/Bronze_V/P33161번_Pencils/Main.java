package BAEKJOON.Bronze.Bronze_V.P33161번_Pencils;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        System.out.print(n / 5);
    }
}
