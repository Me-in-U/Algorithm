package BAEKJOON.Bronze.Bronze_III.P21866번_추첨을_통해_커피를_받자;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        int score;
        for (int i = 0; i < 9; i++) {
            score = readInt();
            sum += score;
            if ((i == 0 || i == 1) && score > 100 ||
                    (i == 2 || i == 3) && score > 200 ||
                    (i == 4 || i == 5) && score > 300 ||
                    (i == 6 || i == 7) && score > 400 ||
                    (i == 8) && score > 500) {
                bw.write("hacker");
                bw.flush();
                return;
            }
        }
        bw.write(100 <= sum ? "draw" : "none");
        bw.flush();
    }

    public static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        return n;
    }
}