package BAEKJOON.Bronze.Bronze_III.P2380번_골뱅이_찍기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder top = new StringBuilder();
        StringBuilder middle = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N * 5; j++) {
                top.append('@');
            }
            top.append('\n');
        }
        for (int i = 0; i < N * 3; i++) {
            for (int j = 0; j < N; j++) {
                middle.append('@');
            }
            for (int j = 0; j < 3 * N; j++) {
                middle.append(' ');
            }
            for (int j = 0; j < N; j++) {
                middle.append('@');
            }
            middle.append('\n');
        }
        StringBuilder sb = new StringBuilder();
        sb.append(top).append(middle).append(top);
        System.out.print(sb.toString());
    }
}