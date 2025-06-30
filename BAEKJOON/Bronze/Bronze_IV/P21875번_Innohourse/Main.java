package BAEKJOON.Bronze.Bronze_IV.P21875번_Innohourse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        int Ax = A.charAt(0) - 'a' + 1;
        int Ay = A.charAt(1) - '0';
        int Bx = B.charAt(0) - 'a' + 1;
        int By = B.charAt(1) - '0';
        int dx = Math.abs(Bx - Ax);
        int dy = Math.abs(By - Ay);
        int x = Math.min(dx, dy);
        int y = Math.max(dx, dy);
        StringBuilder sb = new StringBuilder();
        sb.append(x).append(' ').append(y);
        System.out.println(sb);
    }
}
