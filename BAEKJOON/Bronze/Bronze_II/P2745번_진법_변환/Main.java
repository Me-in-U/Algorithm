package BAEKJOON.Bronze.Bronze_II.P2745번_진법_변환;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int B = Integer.parseInt(input[1]);
        int multiplier = 1;
        int result = 0;
        for (int i = input[0].length() - 1; i >= 0; i--, multiplier *= B) {
            char c = input[0].charAt(i);
            result += multiplier * ((c <= 57) ? (c - 48) : (c - 55));
        }
        System.out.println(result);
    }
}