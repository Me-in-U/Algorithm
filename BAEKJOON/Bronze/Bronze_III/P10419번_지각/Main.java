package BAEKJOON.Bronze.Bronze_III.P10419번_지각;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int d = Integer.parseInt(br.readLine());
            int time = 1;
            while (time + (time * time) <= d) {
                time++;
            }
            sb.append(time - 1).append('\n');
        }
        System.out.print(sb.toString());
    }
}