package BAEKJOON.Bronze.Bronze_III.P6378번_디지털_루트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String N = "";
        while (!(N = br.readLine()).equals("0")) {
            while (N.length() != 1) {
                int digitalRoot = 0;
                for (int i = 0; i < N.length(); i++)
                    digitalRoot += N.charAt(i) - '0';
                N = String.valueOf(digitalRoot);
            }
            sb.append(N).append('\n');
        }
        System.out.print(sb.toString());
    }
}
