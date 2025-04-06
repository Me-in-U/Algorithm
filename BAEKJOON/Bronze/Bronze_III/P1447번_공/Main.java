package BAEKJOON.Bronze.Bronze_III.P1447번_공;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ball = 1;
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            if (ball == X)
                ball = Y;
            else if (ball == Y)
                ball = X;
        }
        System.out.println(ball);
    }
}