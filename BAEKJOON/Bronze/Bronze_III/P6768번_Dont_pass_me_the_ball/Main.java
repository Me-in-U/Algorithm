package BAEKJOON.Bronze.Bronze_III.P6768번_Dont_pass_me_the_ball;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int J = readInt();
        System.out.println((J - 3) * (J - 2) * (J - 1) / 6);
    }

    public static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n << 3) + (n << 1) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
