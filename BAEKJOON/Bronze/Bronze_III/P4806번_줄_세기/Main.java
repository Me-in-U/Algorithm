package BAEKJOON.Bronze.Bronze_III.P4806번_줄_세기;

import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int count = 0;
        while (br.readLine() != null) {
            count++;
        }
        System.out.print(count);
    }
}
