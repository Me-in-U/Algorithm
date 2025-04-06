package BAEKJOON.Bronze.Bronze_III.P9469번_폰_노이만;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine());
        for (int i = 0; i < P; i++) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            double D = Double.parseDouble(input[1]);
            double A = Double.parseDouble(input[2]);
            double B = Double.parseDouble(input[3]);
            double F = Double.parseDouble(input[4]);
            double timeToCrash = D / (A + B);
            double flyDistance = F * timeToCrash;
            System.out.printf("%d %.6f%n", N, flyDistance);
        }
    }
}
