package BAEKJOON.Bronze.Bronze_IV.P32902번_Chips;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int k = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        System.out.println(new StringBuilder().append(n + 1).append(' ').append(k * n + 1));
    }
}
