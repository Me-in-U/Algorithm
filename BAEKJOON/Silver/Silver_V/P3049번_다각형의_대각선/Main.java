package BAEKJOON.Silver.Silver_V.P3049번_다각형의_대각선;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println((N * (N - 1) * (N - 2) * (N - 3)) / 24);
    }
}