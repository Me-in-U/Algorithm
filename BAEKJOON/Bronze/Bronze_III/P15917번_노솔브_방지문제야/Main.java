package BAEKJOON.Bronze.Bronze_III.P15917번_노솔브_방지문제야;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int Q = Integer.parseInt(br.readLine());
        while (Q-- > 0) {
            int a = Integer.parseInt(br.readLine());
            sb.append((a & -a) == a ? 1 : 0).append('\n');
        }
        System.out.print(sb.toString());
    }
}
